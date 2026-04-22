package e260420;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    static Properties props = System.getProperties();

    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String javaHome = System.getenv("JAVA_HOME");
        int count = 0;
        try {
            count = load();
        } catch (Exception e) {
        }

        System.out.println("운영체제 이름: " + osName);
        System.out.println("사용자 이름: " + userName);
        System.out.println("사용자 홈디렉터리: " + userHome);
        System.out.println("[ JAVA _HOME ] " + javaHome);
        System.out.println(count);

        //그냥 데이터 모음 : List
        //중복 제거 필요 : Set
        //극한의 성능 : Array
        //Set은 값만, Map은 key+value
        //Set은 인덱스가 없기 때문에 배열처럼 사용X
        Set keys = props.keySet();
        for (Object objKey : keys) {
            String key = (String)objKey;
            String value = System.getProperty(key);
            System.out.println("[ " + key + " ]" + value);
        }

        try {
            count++;
            save(count);
        } catch (Exception e) {
        }
    }

    public static void save(int value) throws Exception {
        props.setProperty("count", String.valueOf(value));
        props.store(new FileOutputStream("config.properties"), null);
    }

    public static int load() throws Exception {
        props.load(new FileInputStream("config.properties"));

        return Integer.parseInt(props.getProperty("count", "0"));
    }
}
