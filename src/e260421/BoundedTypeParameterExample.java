package e260421;

class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }
}

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(4.5, 3.0);
        System.out.println(result2);

        //extends Number -> 숫자만 가능
        // String str = Util.compare("A", "B");
    }
}
