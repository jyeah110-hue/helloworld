package e260420;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String hello = "안녕하세요";
        byte[] bHello = hello.getBytes();
        System.out.println("bHello.length: " + bHello.length);

        String bHello2String = new String(hello);
        System.out.println("bHello -> String: " + bHello2String);

        try {
            byte[] bEUCKR = hello.getBytes("EUC-KR");
            System.out.println("bEUCKR.length: " + bEUCKR.length);
            String bEUCKR2String = new String(bEUCKR, "EUC-KR");
            System.out.println("bEUCKR -> String: " + bEUCKR2String);

            byte[] bUTF8 = hello.getBytes("UTF8");
            System.out.println("bUTF8.length: " + bUTF8.length);
            String bUTF82String = new String(bUTF8, "UTF8");
            System.out.println("bUTF8 -> String: " + bUTF82String);
        } 
        catch (UnsupportedEncodingException e) {
            e.getStackTrace();
        }
    }
}
