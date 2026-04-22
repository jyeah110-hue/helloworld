package e260421;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        System.out.println(System.getProperty("user.dir"));
        String path = PropertiesExample.class.getResource("config.properties").getPath();
        try {
            path = URLDecoder.decode(path, "utf-8");
            properties.load(new FileReader(path));    
        } catch (Exception e) {
        }
    }
}
