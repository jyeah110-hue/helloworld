package e260421;

class TwoGenerics<T, V> {
    T data1;
    V data2;

    public T getData1() {
        return this.data1;
    }

    public V getData2() {
        return this.data2;
    }

    public TwoGenerics(T d1, V d2) {
        this.data1 = d1;
        this.data2 = d2;
    }

    public void showGenericType() {
        System.out.println("Type of T: " + data1.getClass().getName());
        System.out.println("Type of V: " + data2.getClass().getName());
    }
}

public class TwoGenericsCode {
    public static void main(String[] args) {
        TwoGenerics<Integer, String> x = new TwoGenerics<Integer, String>(100, "hello");
        x.showGenericType();

        int y = x.getData1();
        System.out.println("data1: " + y);
        String z = x.getData2();
        System.out.println("data2: " + z);
    }
}
