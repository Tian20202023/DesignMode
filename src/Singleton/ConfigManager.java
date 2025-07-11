package Singleton;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    // 单例实例
    private static ConfigManager instance = null;

    // 存储配置信息的 Map
    private Map<String, String> configMap;

    // 私有构造函数，防止外部创建对象
    private ConfigManager() {
        configMap = new HashMap<>();
    }

    // 提供公共静态方法 getInstance() 返回单例实例
    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
            instance.load(); // 加载配置数据
        }
        return instance;
    }

    // 提供 load() 方法加载模拟配置数据
    private void load() {
        System.out.println("正在加载配置...");
        configMap.put("database.url", "jdbc:mysql://localhost:3306/mydb");
        configMap.put("max.connection.count", "10");
        // 可以继续添加更多的配置项
    }

    // 提供 get(String key) 方法获取配置值
    public String get(String key) {
        return configMap.get(key);
    }

}