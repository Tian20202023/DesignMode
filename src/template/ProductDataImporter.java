package template;

public class ProductDataImporter extends DataImporter{
    public void readFile(){
        System.out.println("读取产品文件...");
    }
    public void parseData() {
        System.out.println("解析产品数据...");
    }
    public void validateData() {
        System.out.println("校验产品数据...");
    }
    public void saveData() {
        System.out.println("保存产品数据...");
    }
}
