package e260416.dll;

public class CellPhone {
    public String model;
    public String color;

    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("나: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}

// 하나의 파일 안에서 public 클래스는 하나만 생성가능
// public class A {
    // 오류
// }

// 만약 부모클래스 일경우 부모클래스를 default로 생성
// 클래스를 생성할 경우 default만 가능
class A {

}