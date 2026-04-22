package e260420;

import java.util.Objects;

public class NullExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.requireNonNull(str1));

        String name;
        //1. 
        try {
            //null이면 예외발생 -> 따라서 밑에코드 실행X
            name = Objects.requireNonNull(str2);
            // String name2 = Objects.requireNonNull(str2, "");
        } 
        catch (Exception e) {
            name = "기본값";
        }

        //2. 
        if (!Objects.isNull(str2)) {
            name = str2;
        }
        else {
            name = "기본값";
        }

        //3. 
        name = Objects.requireNonNullElse(str2, "기본값");

        System.out.println(name);

        //4. 
        System.out.println(Objects.toString(str2, "기본값"));
    }
}
