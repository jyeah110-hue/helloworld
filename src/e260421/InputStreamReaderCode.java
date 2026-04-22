package e260421;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderCode {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("config.properties"))) {
            //주객체 : FileInputStream
            //보조객체 : InputStreamReader
            //Stream으로만 파일 읽어올경우 바이트로 읽어오기때문에 내용이 깨질 위험이 상당하다.
            //Reader를 덧입힘으로써 바이트 -> 문자로 읽어서 처리하기 때문에 안전하고 속도도 향상된다.
            //주객체를 보조객체가 감싸는 형식이기 때문에 보조객체 메모리를 먼저 해제 후 주객체 메모리를 해제해야한다.
            //그리고 익명 주객체를 보조객체에 넘길경우 디버깅하기 어렵기 때문에 따로따로 객체 생성해서 사용하는게 좋다.
            int x;
            while((x = reader.read()) != -1) {
                System.out.println((char)x);
            }
        } 
        catch (IOException e) {
        }
    }
}
