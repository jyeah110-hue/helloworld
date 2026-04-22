package e260417;

import e260417.dll.Child;
import e260417.dll.Parent;

public class InstanceExample {
    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child)parent;
            System.out.println("method1 - Child로 변환 성공");
            System.out.println(child);
        }
        else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child)parent;
        System.out.println("method2 - Child로 변환 성공");
        System.out.println(child);
    }
    

    public static void main(String[] args) {
        Parent parent1 = new Child();
        method1(parent1);
        method2(parent1);

        Parent parent2 = new Child();
        method1(parent2);
        method2(parent2);
    }
}
