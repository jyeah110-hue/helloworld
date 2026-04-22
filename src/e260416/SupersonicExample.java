package e260416;

import e260416.dll.Supersonic;

public class SupersonicExample {
    public static void main(String[] args) {
        Supersonic supersonic = new Supersonic();
        supersonic.takeOff();
        supersonic.fly();
        supersonic.flyMode = Supersonic.SUPERSONIC;
        supersonic.fly();
        supersonic.flyMode = Supersonic.NORMAL;
        supersonic.fly();
        supersonic.land();
    }
}
