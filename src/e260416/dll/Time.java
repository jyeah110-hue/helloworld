package e260416.dll;

public class Time {
    private int hour;

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    private int minute;

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            return;
        this.minute = minute;
    }

    private int second;

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            return;
        this.second = second;
    }

    public Time(int hour, int minute, int second) {
        this.setHour((hour));
        this.setMinute((minute));
        this.setSecond((second));
    }

    //Time은 Object를 상속받음
    //Object안에는 기본 toString()이 있음
    //@Override 생략
    public String toString() {
        return hour + " : " + minute + " : " + second;
    }
}
