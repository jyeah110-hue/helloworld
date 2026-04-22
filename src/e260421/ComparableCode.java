package e260421;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//TreeSet/Map의 자동정렬
//키의 저장과 동시에 자동 오름차순 정렬
//Class 오름차순 정렬: Comparable을 구현하지 않을 경우 저장하는 순간 예외발생
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
    // Comparable.compareTo
    // -> 클래스 자체에 '기본'정렬 기준을 정의(클래스 내부에 정의)
    // -> 1개만 가능
    // Comparator.compare
    // -> 외부에서 정렬 기준을 따로 정의
    // -> 여러 정렬기준 가능, 클래스 수정 없이 사용가능
    // -> 상황에 따라 다르게 정렬
    public int compareTo(Person p) {
        // a - b > 0 -> a가 더 큼
        // a - b < 0 -> b가 더 큼
        return this.id - p.id;
    }
}

public class ComparableCode {
    public static void main(String[] args) {
        Set<Person> ts = new TreeSet<>();
        ts.add(new Person(3, 83));
        ts.add(new Person(5, 90));
        ts.add(new Person(1, 93));
        ts.add(new Person(2, 88));
        ts.add(new Person(4, 70));

        Iterator<Person> iter = ts.iterator();
        while (iter.hasNext()) {
            // 재정의 안했다면 주소값 출력
            System.out.println(iter.next());
        }
    }
}
