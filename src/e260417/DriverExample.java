package e260417;

import e260417.dll.Bus;
import e260417.dll.Driver;
import e260417.dll.Taxi;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //부모클래스로 형변환 되었더라도 원래는 자식클래스였기 때문에
        //child.drive()가 호출된다.
        driver.drive(bus);//버스가 달립니다.
        driver.drive(taxi);//택시가 달립니다.
    }
}
