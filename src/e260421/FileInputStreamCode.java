package e260421;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamCode {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            //실행경로
            // String path = System.getProperty("user.dir");
            //실행된 클래스
            // String path = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            byte[] b = new byte[50];
            fis.read(b);
            for (byte x : b) {
                System.out.println((char)x);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("config.properties 는 없는 파일입니다.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (NullPointerException e) {

        }
    }
}
