package e260421;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCode {
    public static void main(String[] args) {
        int A[] = { 4, 6, 1, 9, 8, 10, 5, 2, 3, 7 };
        //Set은 중복값 허용X, 인덱스X
        Set<Integer> ts = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            //이진트리 -> 좌측이 우선
            //TreeSet은 추가와 동시에 자동 힙정렬 된다.
            //-> TreeSet은 중복X + 정렬O 필요할 경우에 사용
            ts.add(A[i]);
        }

        //결과적으로 1~10 순으로 저장
        System.out.println(ts);

        //주소만큼 움직이기 때문에 4바이트씩 이동
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
    }
}
