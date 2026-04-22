package e260415;

import e260415.dll.Car;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company: " + car1.company);

        Car car2 = new Car("자가용");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);

        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxSpeed: " + car4.speed);

        Car car5 = new Car();
        car5.setGas(5);

        boolean gasState = car5.isLeftGas();
        if (gasState) {
            System.out.println("출발합니다.");
            //car5.run();
        }
        
        if (car5.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }

        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar.run();
        yourCar.run();
    }
}
