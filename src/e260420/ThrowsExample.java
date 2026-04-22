package e260420;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            //findClass 예외발생 시, main메서드의 catch에서 예외처리된다
            findClass();
            
        } catch (Exception e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    //throws는 호출한 메서드에게 예외처리를 넘긴다.
    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
        //Class.forName 내부에서 자체적으로 throw가 발생된다.
        //throw new ClassNotFoundException();
        //그걸 main으로 전달
        System.out.println(clazz);
    }
}
