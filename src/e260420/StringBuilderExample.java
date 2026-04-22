package e260420;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");      //Java2 Program Study
        sb.setCharAt(4, '6');     //Java6 Program Study

        //문자 수정 가능 ->  객체 새로 생성X -> 주소 동일
        //만약 String.replace -> 문자열 새로 생성O -> 주소 다름 
        sb.replace(6, 13, "Book");
    }
}
