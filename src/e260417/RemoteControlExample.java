package e260417;

import e260417.dll.Audio;
import e260417.dll.RemoteControl;
import e260417.dll.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc1;
        rc1 = new Television();
        rc1 = new Audio();
        System.out.println(rc1);

        RemoteControl rc2;
        rc2 = new Television();
        System.out.println(rc2);

        // rc1.static 사용X
        // interface.static 권장
        // if (rc1.MAX_VOLUME == rc2.MAX_VOLUME) {
        // System.out.println("rc1.MAX_VOLUME : " + rc1.MAX_VOLUME);
        // System.out.println("rc2.MAX_VOLUME : " + rc2.MAX_VOLUME);
        // }
        // else {
        // System.out.println("다름");
        // }

        // 인터페이스로만 접근 가능
        // rc1.changeBattery();
        RemoteControl.changeBattery();
    }
}
