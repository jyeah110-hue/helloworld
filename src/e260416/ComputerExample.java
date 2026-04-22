package e260416;

import e260416.dll.Computer;
import e260416.dll.Calculator;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator calc = new Calculator();
        System.out.println("원 면적 : " + calc.areaCircle(r));
        System.out.println();
        Computer com = new Computer();
        System.out.println("원 면적 : " + com.areaCircle(r));
    }
}
