package utils;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class LoadProperties {
    public Properties properties;
 
    /*
     * Constructor Name: LoadProperties
     * Author Name: T Gnana Asritha
     * Description: Initializes the PropertyReader with the specified property file.
     * Param List: String propertyFilePath - The path to the property file.
     */
 
    public LoadProperties() {
        String propertiesPath = System.getProperty("user.dir") + "/config/browser.properties";
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream(propertiesPath)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    /*
     * Method Name: getProperty
     * Author Name: T Gnana Asritha
     * Description: Retrieves the value of the specified property key.
     * Return type: String
     * Param List: String key - The property key.
     */
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
   
}
