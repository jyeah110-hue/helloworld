package e260421;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private int score;

    public Person() {
    }

    public Person(int id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "[ id = " + id + ", score = " + score + " ]";
    }

    @Override
    //Person은 사용자가 만든 클래스이기 때문에 비교기준을 만들어줘야 정렬할 수 있음.
    public int compareTo(Person p) {
        //a - b > 0 -> a가 더 큼
        //a - b < 0 -> b가 더 큼
        return this.id - p.id;
    }
}

public class UserComparableCode {
    public static void main(String[] args) {
        Set<Person> ts = new TreeSet<>();
        ts.add(new Person(3, 83));
        ts.add(new Person(5, 90));
        ts.add(new Person(1, 93));
        ts.add(new Person(2, 88));
        ts.add(new Person(4, 70));

        Iterator<Person> iter = ts.iterator();
        while(iter.hasNext()) {
            //재정의 안했다면 주소값 출력
            System.out.println(iter.next());
        }
    }
}
