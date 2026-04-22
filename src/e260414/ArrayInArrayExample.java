package e260414;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        /*
            int[][] arr = new int[2][3];
            [2]: 행, [3]: 열
            arr -> 행의 시작주소 저장
            idx:0 { (A) (B) }, idx:1 { (C) (D) (E) }
            자료구조상 {} -> () 순서로 접근
            idx:0에는 (A)의 시작주소 저장
            idx:1에는 (C)의 시작주소 저장
        */

        //고정 이차원배열
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
            }
        }

        System.out.println();

        /*
            arr에는 행의 시작주소가 저장되기 때문에 
            행만 있어도 이차원배열 생성 가능(-> 열은 가변적으로 정의)
            -> idx:0 { }, idx:1 { }
            반대로 행이 없을경우 주소저장이 불가능하기 때문에 
            행은 가변적으로 사용할 수 없다
         */
        
        //가변 이차원배열
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for (int i = 0; i < englishScores.length; i++) {
            for (int j = 0; j < englishScores[i].length; j++) {
                System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
            }
        }
        System.out.println();

        int[][] javaScores = {{95, 80}, {92, 96, 80}};
        for (int i = 0; i < javaScores.length; i++) {
            for (int j = 0; j < javaScores[i].length; j++) {
                System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
            }
        }
    }
}
