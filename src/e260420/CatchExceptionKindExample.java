package e260420;

public class CatchExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;

            System.out.println(data1 + "+" + data2 + " = " + result);
        } 
        //try-catch문은 여러개 나눠서 쓰기보다는 하나로 묶어서 쓰는것을 지향
        //catch는 순선대로 처리
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("[실행 방법]");
            System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
        } 
        catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } 
        //exception은 예외처리 최상위클래스이기 때문에 맨 마지막에
        catch (Exception e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } 
        //finally 사용하는 경우
        //-> 파일/DB/네트워크 같은 리소스 반드시 해제해야할 경우
        //-> try-with-resources 못쓰는 경우
        //상황에 따라 안쓰는게 더 좋은 경우가 많다. "무조건 실행되는" 특징으로 남용하면 코드품질 저하
        finally {
            System.out.println("다시 실행하세요.");

            //1. finally에서 return사용 금지
            //try { return 1; } finally { return 2; } -> 2 반환

            //2. 예외 무시됨, 예외는 발생하지만 흐름 꼬임
            // try { int x = 10 / 0; } 
            // catch (Exception e) { 아무처리 안함 }
            // finally { return ;} 
        }
    }
}
