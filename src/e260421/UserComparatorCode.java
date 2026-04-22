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

//Comparator 기능하는 클래스에는 compare 하나만 정의해야 한다.
//다른 기능 있을경우 인식 못함
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getID() - p2.getID();
    }
}

public class UserComparatorCode {
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
