package classwork_15;

public class AppConfig {
    private static AppConfig instance;
    
    String version = "1.0";
    
    private AppConfig() {
    	
    }
    
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}
