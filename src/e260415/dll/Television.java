package e260415.dll;

public class Television {
    public static String company = "Samsung";
    public static String model = "LCD";
    public static String info;

    public int field1;
    public int field2;

    // static멤버에 해당하는 필드의 초기화 블록
    static {
        // static은 static 필드/메소드만 가능
        info = company + "-" + model;
        method2();

        // field1 = 0;
        // field2 = 0;
        // method1();
    }

    public String method1() {
        return "";
    }

    public static String method2() {

        // 객체가 아직 존재하지 않기때문에 this사용 & 필드 접근 X
        // this.field1 = 0;
        // field1 = 0;

        // 사용하고 싶다면
        Television tv = new Television();
        tv.field1 = 10;
        return "";
    }

    //이런건 기본 필드로 충분
    static String name = "홍길동";
    //복잡한 초기화는 예외가능성 있음
    static String data = method2();
    //객체 생성자 이전에 실행: this없음, 인스턴스 접근X
    //클래스가 메모리에 올라갈 때 딱 1번 실행되는 초기화 코드
    static {
        try {
            Television tv = new Television();
            tv.field1 = 10;
            data = tv.method1();
            
            data = method2();
        } catch (Exception e) {
            data = "기본값";
        }
    }
}
