package e260420.dll;

//final class 상속불가능한 클래스
// -> class 동작 변경 못하게 막음 (확장X)
// -> 상속해서 내부 로직 바꾸는 행위 방지(보안/안정성)
// -> 상속을 막아서 구조를 고정시키는 클래스
public final class Card {
    String kind;
    int num;

    public Card() {
        this("SPADE", 1);
    }

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return kind + " : " + num;
    }
}
