package e260420;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) {
        byte[] bytes = new byte[10];

        System.out.println("입력: "); // yejuya + 엔터
        try {
            // 1. BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // String str = br.readLine();
            // 2. Scanner scanner = new Scanner(System.in);
            // String str = scanner.nextLine();

            // [y][e][j][u][y][a][\r][\n]
            // 엔터까지 포함해서 읽기 때문에 + 2 -> 오류 발생위험으로 잘 안씀
            int readBytesLen = System.in.read(bytes);
            String str = new String(bytes, 0, readBytesLen - 2);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
