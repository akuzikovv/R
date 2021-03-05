package RealiseMe.com.pages.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    public static String getPropertyFilePath() {
        String propertyFilePath = null;
        switch (System.getProperty("os.name")) {
            case "Linux":
                propertyFilePath = "/src/test/resources/properties/";
                break;
            case "Windows 10":
                propertyFilePath = "\\src\\test\\resources\\properties\\";
                break;
        }
        return propertyFilePath;
    }

    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static final String propertyFilePath = System.getProperty("user.dir") + getPropertyFilePath() + "envChatDemo.properties";
//    private static final String propertyFilePath = System.getProperty("user.dir") + getPropertyFilePath() + System.getenv("env_name");
    private static String url;
    private static String version;
    private static String temp_mail_url;

    public String getTemp_mail_url() {
        return temp_mail_url;
    }

    public void setTemp_mail_url(String temp_mail_url) {
        PropertyManager.temp_mail_url = temp_mail_url;
    }

    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        PropertyManager.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        PropertyManager.version = version;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        //Get properties from configuration.properties
        url = prop.getProperty("url");
        version = prop.getProperty("version");
        temp_mail_url = prop.getProperty("temp_mail_url");

    }

}
