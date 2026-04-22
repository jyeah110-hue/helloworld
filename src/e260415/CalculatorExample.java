package e260415;

import java.util.Scanner;

import e260415.dll.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.powerOn();

        try (Scanner scanner = new Scanner(System.in)) {
            // System.out.print("더하기 x: ");
            // int addX = Integer.parseInt(scanner.nextLine());
            // System.out.print("더하기 y: ");
            // int addY = Integer.parseInt(scanner.nextLine());

            // int result1 = calc.plus(addX, addY);
            // System.out.println("result1: " + result1);
    
            // System.out.print("나누기 x: ");
            // int divX = Integer.parseInt(scanner.nextLine());
            // System.out.print("나누기 y: ");
            // int divY = Integer.parseInt(scanner.nextLine());

            // double result2 = calc.divide(divX, divY);
            // System.out.println("result2: " + result2);

            calc.execute();

            int[] inums = {10, 20, 30};
            int result1 = calc.plus(inums);
            System.out.println("result1 : " + result1);

            double[] dnums = {10.4, 20.2, 30.7};
            double result2 = calc.plus(dnums);
            System.out.println("result2 : " + result2);

            double result3 = 10 * Calculator.PI;
            System.out.println("result3 : " + result3);

            int result4 = Calculator.add(10, 5);
            System.out.println("result4 : " + result4);
        } 
        catch (Exception e) {
            // TODO: handle exception
        }

        calc.powerOff();
    }
}
