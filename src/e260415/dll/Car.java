package e260415.dll;

public class Car {
    public String company = "현대자동차";
    public String model;
    public String color;
    public int speed;
    public int gas;

    public Car() {

    }

    public Car(String model) {
        // this.model = model;

        // 다른 생성자 호출 this()
        // Car(String model, String color, int maxSpeed)
        this(model, null, 0);
    }

    public Car(String model, String color) {
        // this.model = model;
        // this.color = color;

        this(model, color, 0);
    }

    // 가장 많은 파라미터 생성자 -> 실제 초기화
    // 나머지 생성자 -> this()로 대체 가능
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;

        // 생성자 호출 규칙
        // 자기 자신 호출 금지
        // 순환 호출 금지
        // this(model, color, maxSpeed);
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }

        System.out.println("gas가 있습니다.");
        return false;
    }

    public void run() {
        // while (true) {
        //     if (gas > 0) {
        //         System.out.println("달립니다. (gas 잔량: " + gas + ")");
        //         gas -= 1;
        //     }
        //     else {
        //         System.out.println("멈춥니다. (gas 잔량: " + gas + ")");
        //         return;
        //     }
        // }

        for (int i = 0; i < 50; i+=10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
        }
    }
}
