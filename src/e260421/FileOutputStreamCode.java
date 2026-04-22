package e260421;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamCode {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("config.properties")) {
            String content = scanner.nextLine();
            byte[] bytes = content.getBytes();
            //FileOutputStream.write() -> 기존내용 삭제
            //이어서 쓰고싶으면 FileWriter.write() 사용 
            fos.write(bytes);
        } catch (IOException e) {

        }
    }
}
