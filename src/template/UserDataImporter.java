package template;

public class UserDataImporter extends DataImporter {
    public void readFile(){
        System.out.println("读取用户文件...");
    }
    public void parseData() {
        System.out.println("解析用户数据...");
    }
    public void validateData() {
        System.out.println("校验用户数据...");
    }
    public void saveData() {
        System.out.println("保存用户数据...");
    }
}
