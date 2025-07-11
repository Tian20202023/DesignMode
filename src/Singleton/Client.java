package Singleton;

public class Client {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();

        // 获取并打印配置信息
        System.out.println("数据库地址: " + configManager.get("database.url"));
        System.out.println("最大连接数: " + configManager.get("max.connection.count"));
    }
}
