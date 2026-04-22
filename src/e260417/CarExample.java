package e260417;

import e260417.dll.Car;
import e260417.dll.KumhoTire;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();
        for (int i = 0; i < car.tires.length; i++) {
            car.tires[i] = new KumhoTire();
        }

        car.run();
    }
}
