package e260417.dll;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println(RemoteControl.MAX_VOLUME); ;
            System.out.println(Audio.MAX_VOLUME); ;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println(RemoteControl.MIN_VOLUME); ;
            System.out.println(Audio.MIN_VOLUME); ;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}
