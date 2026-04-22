package e260416.dll;

public class Computer extends Calculator{
    @Override   //Override는 자식클래스만 사용가능
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * Math.pow(r, 2);
    }
}
