package e260420;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        /*
         * [abc] : a, b, c 중 하나의 문자
         * [^abc] : a, b, c 이외의 하나의 문자
         * [a-zA-Z] : a~z, A~Z 중 하나의 문자
         * \d 한개의 숫자(=0~9)
         * \s 공백
         * \w 한개의 알파벳 또는 한개의 숫자(=[a-zA-Z_0-9])
         * ? 없음 or 한개
         * * 없음 or 한 개 이상
         * + 한개 이상
         * {n} 정확히 n개
         * {n,} 최소한 n개
         * {n,m} n~m개
         * () 그룹핑
         */
        String regexExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regexExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");
        } 
        else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        regexExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@navercom";
        result = Pattern.matches(regexExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");
        } 
        else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
