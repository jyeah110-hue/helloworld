package e260415;

import e260415.dll.Singletone;

public class SingletoneExample {
    public static void main(String[] args) {
        Singletone instance = Singletone.getInstance();
        int num1 = instance.getNum();
        System.out.println("num1: " + num1);
        instance.setNum(10);
        System.out.println("num1: " + num1);

        instance.isBoolean = true;
    }
}
