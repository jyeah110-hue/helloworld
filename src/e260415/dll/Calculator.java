package e260415.dll;

public class Calculator {
    public static final double PI = 3.14159;

    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public int plus(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    public double plus(double[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }

    public double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    public void execute() {
        double result = avg(7, 10);
        println("실행결과: " + result);
    }

    private void println(String message) {
        System.out.println(message);
    }
}
