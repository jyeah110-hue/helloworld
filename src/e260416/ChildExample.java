package e260416;

import e260416.dll.Child;
import e260416.dll.Parent;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();

        //부모에 정의되있는 것만 사용 가능
        //parent.method3();
    }
}
