package e260421;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputExample {
    public static void main(String[] args) {
        // OutputStream: 바이트 기반 출력 최상위 클래스
        // OutputStream fos = new FileOutputStream();
        // OutputStream ps = new PrintStream();
        // OutputStream bos = new BufferedOutputStream();
        // OutputStream dos = new DataOutputStream();

        // Writer: 문자 기반 출력 최상위 클래스
        // Writer fw = new FileWriter();
        // Writer bw = new BufferedWriter();
        // Writer pw = new PrintWriter();
        // Writer osw = new OutputStreamWriter();

        try (Scanner scanner = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("config.properties")) {
            String content = scanner.nextLine();
            byte[] bytes = content.getBytes();
            // FileOutputStream.write() -> 기존내용 삭제
            // 이어서 쓰고싶으면 FileWriter.write() 사용
            fos.write(bytes);
        } catch (IOException e) {

        }

        char[] chars = {'J', 'A', 'V', 'A'};
        String lang = "Language";
        FileWriter fw = null;
        try {
            fw = new FileWriter("config.properties");
            //이어쓰기
            fw.write(chars);
            fw.write("\n-----------\n");
            fw.write(lang);
        } catch (IOException e) {
        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
