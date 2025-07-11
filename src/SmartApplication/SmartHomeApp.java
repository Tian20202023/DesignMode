package SmartApplication;

import java.util.Scanner;

public class SmartHomeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用智能家居系统");

        while (true) {
            // 用户选择厂商
            System.out.print("请选择设备厂商 [XIAOMI, HUAWEI, PHILIPS]: ");
            String vendorInput = scanner.nextLine().toUpperCase();
            Vendor vendor = Vendor.valueOf(vendorInput);

            // 用户选择设备类型
            System.out.print("请选择设备类型 [LIGHT, AIR_CONDITIONER, SPEAKER]: ");
            String typeInput = scanner.nextLine().toUpperCase();
            DeviceType deviceType = DeviceType.valueOf(typeInput);

            // 获取对应厂商的工厂
            DeviceFactory factory = getFactoryByVendor(vendor);

            // 创建设备
            SmartDevice device = null;
            switch (deviceType) {
                case LIGHT:
                    device = factory.createSmartLight();
                    break;
                case AIR_CONDITIONER:
                    device = factory.createSmartAirConditioner();
                    break;
                case SPEAKER:
                    device = factory.createSmartSpeaker();
                    break;
                default:
                    System.out.println("未知的设备类型");
                    continue; // 跳过后续步骤，重新开始循环
            }

            if (device != null) {
                // 输出设备信息并注册到 DeviceManager
                System.out.println("数据：已创建设备：" + device.getDescription());
                DeviceManager.getInstance().register(device);

                // 如果是灯，提供克隆选项
                if (device instanceof SmartLight) {
                    System.out.print("是否部署多个房间？Y/N: ");
                    String deploy = scanner.nextLine();
                    if ("Y".equalsIgnoreCase(deploy)) {

                        SmartLight template = null;
                        switch (vendor) {
                            case XIAOMI:
                                template = new XiaomiLight();
                                break;
                            case HUAWEI:
                                template = new HuaweiLight();
                                break;
                            case PHILIPS:
                                template = new PhilipsLight();
                                break;
                        }

                        if (template != null) {
                            SmartLight light2 = template.clone();
                            SmartLight light3 = template.clone();

                            System.out.println("设备克隆成功：Room2 使用 " + light2.getDescription());
                            System.out.println("设备克隆成功：Room3 使用 " + light3.getDescription());

                            DeviceManager.getInstance().register(light2);
                            DeviceManager.getInstance().register(light3);
                        }
                    }
                }
            } else {
                System.out.println("无法创建设备，请检查输入的厂商和设备类型。");
            }

            // 询问是否继续添加设备
            System.out.print("是否继续添加设备？Y/N: ");
            String continueInput = scanner.nextLine();
            if (!"Y".equalsIgnoreCase(continueInput)) {
                break; // 结束循环
            }
        }

        // 展示所有已注册设备
        DeviceManager.getInstance().showAllDevices();

        scanner.close();
    }

    private static DeviceFactory getFactoryByVendor(Vendor vendor) {
        switch (vendor) {
            case XIAOMI:
                return new XiaomiFactory();
            case HUAWEI:
                return new HuaweiFactory();
            case PHILIPS:
                return new PhilipsFactory();
            default:
                throw new IllegalArgumentException("未知的厂商");
        }
    }
}