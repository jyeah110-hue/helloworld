package e260420;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";

        StringTokenizer st = new StringTokenizer(text, "/");
        int cntTokens = st.countTokens();
        //1. 만약 첫번째 토큰만 접근하고 for문을 종료했다면 
        //다음 while에서 nextToken은 두번째 토큰
        //2. 끝까지 접근했다면
        //다음 while에서 nextToken은 null 반환
        for (int i = 0; i < cntTokens; i++) {
            //if (st.hasMoreTokens())
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println();

        //만약 다시 첫번째 토큰부터 접근하고 싶다면 다시 생성해줘야한다.
        st = new StringTokenizer(text, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
