package e260417.dll;

//abstract가 사용될 경우 abstract class라고 한다.
public abstract class Animal {
    public String kind;

    public void breath() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound1();
    // public abstract void sound2();
}
