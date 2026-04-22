package e260421;

class GenericExtends<T extends Number> {
    private T obj;

    public GenericExtends(T obj) {
        this.obj = obj;
    }

    int calcMultiple(int n) {
        return obj.intValue() * n;
    }
}

public class GenericExtendsCode {
    public static void main(String[] args) {
        GenericExtends<Integer> iNum = new GenericExtends<Integer>(100);
        int iResult = iNum.calcMultiple(5);
        System.out.println(iResult);

        GenericExtends<Double> dNum = new GenericExtends<Double>(17.5);
        int dResult = dNum.calcMultiple(5);
        System.out.println(dResult);
    }
}
