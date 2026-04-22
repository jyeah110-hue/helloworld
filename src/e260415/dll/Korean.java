package e260415.dll;

public class Korean {
    //명시적 초기화
    public String nation = "대한민국";
    public String name;
    public String ssn;

    //초기화순서
    //명시적 초기화 -> 생성자 초기화
    //생성자를 통해 초기화되지 않은 변수는 OS가 기본값을 채워준다

    //이 상태는 필드 초기화라고 생각하면 안됨. 그냥 기본값
    public Korean() {

    }

    //생성자를 통한 필드 초기화가 완벽한 초기화
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
