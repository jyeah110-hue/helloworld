package e260417.dll;

public class Bus extends Vehicle {
    @Override
    public void run() {
        //super.run();
        System.out.println("버스가 달립니다.");
    }

    public void add() {
        System.out.println("승객이 탑승합니다.");
    }
}
