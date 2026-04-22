package e260414;

public class ArrayCreateByExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

        double[] arr2 = new double[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        String[] arr3 = new String[3];
        for (int i = 0; i < arr3.length; i++) {
            //String객체를 생성하는 것이기 때문에 기본값 null
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";

        for (int i = 0; i < arr3.length; i++) {
            // arr3[i]:주소 != arr3[i].ToString():값
            //다만, 자동으로 처리해주기 때문에 값이 출력되는 것
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }

        String[] arr4 = new String[3];
        arr4[0] = "Java";
        arr4[1] = "Java";
        arr4[2] = new String("Java");

        System.out.println(arr4[0] == arr4[1]);
        System.out.println(arr4[0] == arr4[2]);
        System.out.println(arr4[0].equals(arr4[2]));
    }
}
