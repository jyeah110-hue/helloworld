package e260417.dll;

public class Driver {
    public void drive(Vehicle vehicle) {
        // (Bus)vehicle
        // 부모클래스로 형변환 되었더라도 원래는 자식클래스였기 때문에
        // bus.drive()가 호출된다.
        vehicle.run();

        // 부모클래스로 받았기 때문에 부모에 포함된 메소드만 호출가능
        // 자식에서 생성한 메소드는 호출X
        // vehicle.add();

        //만약 Vehicle.run()을 처리하고 싶다면
        //여기서 super.run()하는게 아니고
        //Bus.run() 또는 Taxi.run()에서 처리해야 한다.
    }
}
