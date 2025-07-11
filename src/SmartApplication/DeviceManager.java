package SmartApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * DeviceManager 是一个单例类，用于管理所有创建的 SmartDevice 设备。
 */
public class DeviceManager {
    // 单例实例
    private static DeviceManager instance;

    // 存储已注册设备的列表
    private List<SmartDevice> devices;

    // 私有构造方法，防止外部实例化
    private DeviceManager() {
        devices = new ArrayList<>();
    }

    // 获取单例实例（线程安全）
    public static synchronized DeviceManager getInstance() {
        if (instance == null) {
            instance = new DeviceManager();
        }
        return instance;
    }

    /**
     * 注册一个设备到管理系统中
     *
     * @param device 要注册的设备
     */
    public void register(SmartDevice device) {
        if (device != null && !devices.contains(device)) {
            devices.add(device);
            System.out.println("数据：设备已注册 - " + device.getDescription());
        } else {
            System.out.println("数据：设备为空或已注册");
        }
    }

    /**
     * 显示当前系统中所有已注册的设备
     */
    public void showAllDevices() {
        if (devices.isEmpty()) {
            System.out.println("当前没有注册任何设备。");
        } else {
            System.out.println("【当前注册的设备列表】");
            for (SmartDevice device : devices) {
                System.out.println("- " + device.getDescription());
            }
        }
    }

    /**
     * 获取当前注册的设备数量
     *
     * @return 设备总数
     */
    public int getDeviceCount() {
        return devices.size();
    }
}
