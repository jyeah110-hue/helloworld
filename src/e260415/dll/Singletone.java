package e260415.dll;

public class Singletone {
    private static Singletone singletone = new Singletone();
    private static int num;
    public boolean isBoolean = false;

    private Singletone() {

    }

    public static Singletone getInstance() {
        return singletone;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int val) {
        num = val;
    }
}
