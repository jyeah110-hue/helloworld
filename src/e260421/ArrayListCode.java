package e260421;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCode {
    public static void main(String[] args) {
        //List -> 타입(인터페이스)
        //ArrayList -> 실제 객체
        //나중에 이러게 바꿀 수 있음(코드 최소화)
        //number = new LinkedList<String>();
        List<String> number = new ArrayList<String>();
        number.add("one");
        number.add("two");
        number.add("three");
        number.add(2, "four");  //idx 2에 삽입됨

        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
    }
}
