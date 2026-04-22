package e260415;

import e260415.dll.Computer;

public class ComputerExample {
    public static void main(String[] args) {
        Computer com = new Computer();

        // 리터럴 배열
        int[] values1 = { 1, 2, 3 };
        int result1 = com.sum1(values1);
        System.out.println("result1 : " + result1);

        //익명배열 사용X
        // int result2 = com.sum1(new int[] { 1, 2, 3, 4, 5 });
        int[] values2 = { 1, 2, 3, 4, 5 };
        int result2 = com.sum1(values2);
        System.out.println("result2 : " + result2);
    }
}
