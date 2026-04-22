package e260421;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCode {
    public static void main(String[] args) {
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
