package e260416;

import e260416.dll.Car;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(-50);
        System.out.println("현재속도 : " + car.getSpeed());

        car.setSpeed(60);

        if (!car.isStop()) {
            car.setStop(true);
        }
        System.out.println("현재속도 : " + car.getSpeed());
    }
}
