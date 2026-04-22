package e260420;

import e260420.dll.Car;
import e260420.dll.Member;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1 과 obj2 는 동등합니다.");
        } else {
            System.out.println("obj1 과 obj2 는 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1 과 obj3 는 동등합니다.");
        } else {
            System.out.println("obj1 과 obj3 는 동등하지 않습니다.");
        }

        Member original1 = new Member("blue", "홍길동", "12345", 25, true);
        Member cloned1 = original1.getMember();
        cloned1.password = "67890";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: " + cloned1.id);
        System.out.println("name: " + cloned1.name);
        System.out.println("password: " + cloned1.password);
        System.out.println("age: " + cloned1.age);
        System.out.println("adult: " + cloned1.adult);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: " + original1.id);
        System.out.println("name: " + original1.name);
        System.out.println("password: " + original1.password);
        System.out.println("age: " + original1.age);
        System.out.println("adult: " + original1.adult);

        Member original2 = new Member("홍길동", 25, new int[] {90, 99}, new Car("소나타"));
        Member cloned2 = original2.getMember();
        cloned2.scores[0] = 100;
        cloned2.car.model = "그랜저";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("name: " + cloned2.name);
        System.out.println("age: " + cloned2.age);
        System.out.print("scores: { ");
        for (int i = 0; i < cloned2.scores.length; i++) {
            System.out.print(cloned2.scores[i]);
            System.out.print((i == cloned2.scores.length - 1) ? " " : ", ");
        }

        System.out.print("}\r");
        System.out.println("car: " + cloned2.car.model);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("name: " + original2.name);
        System.out.println("age: " + original2.age);
        System.out.print("scores: { ");
        for (int i = 0; i < original2.scores.length; i++) {
            System.out.print(original2.scores[i]);
            System.out.print((i == original2.scores.length - 1) ? " " : ", ");
        }

        System.out.println("}\r");
        System.out.println("car: " + original2.car.model);
    }
}
