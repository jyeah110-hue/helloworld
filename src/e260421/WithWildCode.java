package e260421;

class WithWild<T extends Number> {
    T data;
    public WithWild(T data) {
        this.data = data;
    }

    public boolean isSame(WithWild<?> x) {
        if (Math.abs(this.data.doubleValue()) == Math.abs(x.data.doubleValue())) {
            return true;
        }
        return false;
    }
}

public class WithWildCode {
    public static void main(String[] args) {
        WithWild<Integer> a = new WithWild<Integer>(6);
        WithWild<Double> b = new WithWild<Double>(-6.0);
        WithWild<Long> c = new WithWild<Long>(5L);

        if (a.isSame(b)) {
            System.out.println("a and b are equal");
        } 
        else {
            System.out.println("a and b are different");
        }

        if (a.isSame(c)) {
            System.out.println("a and c are equal");
        } 
        else {
            System.out.println("a and c are different");
        }
    }
}
