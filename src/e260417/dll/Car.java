package e260417.dll;

public class Car {
    // Tire frontLTire = new HankookTire();
    // Tire frontRTire = new HankookTire();
    // Tire backLTire = new HankookTire();
    // Tire backRTire = new HankookTire();

    // ver.Clean Code
    public Tire[] tires = new Tire[4];

    public Car() {
        for (int i = 0; i < tires.length; i++) {
            if (i < 2) {
                tires[i] = new HankookTire();
                continue;
            }

            tires[i] = new KumhoTire();
        }
    }

    public void run() {
        // frontLTire.roll();
        // frontRTire.roll();
        // backLTire.roll();
        // backRTire.roll();
        
        // ver.Clean Code
        for (int i = 0; i < tires.length; i++) {
            tires[i].roll();
        }
    }
}
