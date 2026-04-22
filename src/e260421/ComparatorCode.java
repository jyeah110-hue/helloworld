package e260421;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person {
    private int id;
    private int score;

    public int getID() {
        return this.id;
    }

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
}

//Comparable.compareTo 
// -> 클래스 자체에 '기본'정렬 기준을 정의(클래스 내부에 정의)
// -> 1개만 가능
//Comparator.compare 
// -> 외부에서 정렬 기준을 따로 정의
// -> 여러 정렬기준 가능, 클래스 수정 없이 사용가능
// -> 상황에 따라 다르게 정렬
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getID() - p2.getID();
    }
}

public class ComparatorCode {
    public static void main(String[] args) {
        Set<Person> ts = new TreeSet<>(new PersonComparator());
        ts.add(new Person(4, 83));
        ts.add(new Person(5, 90));
        ts.add(new Person(2, 93));
        ts.add(new Person(1, 88));
        ts.add(new Person(3, 70));

        for (Person p : ts) {
            System.out.println(p);
        }
    }
}
