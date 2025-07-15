package template;

public class Client {
    public static void main(String[] args) {
        System.out.println("【用户数据导入】");
        DataImporter diU=new UserDataImporter();
        diU.importData();

        System.out.println("【产品数据导入】");
        DataImporter diP=new ProductDataImporter();
        diP.importData();
    }
}
