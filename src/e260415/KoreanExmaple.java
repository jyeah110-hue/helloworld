package e260415;

import e260415.dll.Korean;

public class KoreanExmaple {
    public static void main(String[] args) {
        Korean k1 = new Korean();
        //""이 아니라 null
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        
        Korean k2 = new Korean("박자바", "011225-1234567");
        System.out.println(k2.name);
        System.out.println(k2.ssn);

        Korean k3 = new Korean("김자바", "930525-0654321");
        System.out.println(k3.name);
        System.out.println(k3.ssn);
    }
}
