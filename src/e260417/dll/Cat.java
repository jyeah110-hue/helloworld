package e260417.dll;

//구현 클래스
public class Cat extends Animal {
    public Cat() {
        //물리적으로는 다른 주소지만 논리적으로는 부모클래스와 자식클래스는 하나이기때문에
        //부모클래스의 필드도 this 사용 가능
        this.kind = "포유류";
    }

    //abstract class Animal을 상속만 받고 abstract method를 Override 안하면
    //Cat는 여전히 abstract class인 상태이다.
    //따라서 abstract classs Cat로 사용해야 한다
    //Override는 모든 abstract method를 구현해야 한다.
    @Override
    public void sound1() {
        System.out.println("야옹");
    }

    //sound2가 구현이 안되었다면 여전히 abstract가 구현이 안된상태
    //따라서 abstract class Dog
}
