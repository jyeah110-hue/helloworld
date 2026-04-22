package e260417.dll;

//파일 형식으로만 존재
//객체생성안되기 때문에 메모리 점유X
//static 필드는 인터페이스와 달리 메모리가 점유된다.
//따라서 interface.method()가 사용가능
public interface RemoteControl {
    //public static final 생략
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 10;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음");
        }
        else {
            System.out.println("무음 해제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교체필요.");
    }
}
