package e260415;

import java.text.SimpleDateFormat;
import java.util.Date;

import e260415.dll.Earth;

public class EarthExample {
    public static void main(String[] args) {
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");

        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
}
