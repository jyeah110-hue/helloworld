package e260416;

import e260416.dll.Time;

public class TimeExample {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);

        System.out.println(t);
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}
