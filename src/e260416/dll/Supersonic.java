package e260416.dll;

public class Supersonic extends Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 1;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속비행합니다.");
        } else {
            super.fly();
        }
    }
}
