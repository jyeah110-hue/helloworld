package e260420.dll;

import java.util.Arrays;

//extends Object 생략된 상태
public class Member implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;
    public int[] scores;
    public Car car;

    public Member(String id) {
        this.id = id;
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            //Cloneable의 역할: "이 객체는 복제 허용합니다" 표시만 함
            //Cloneable에는 아무것도 없음
            //@Override clone() 정의X -> Object.clone()
            //@Override clone() 정의O -> this.clone()
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }


    @Override
    //Object.equals 재정의
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member)obj;
            if (id.equals(member.id)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Member cloned = (Member) super.clone();

        if (cloned.scores != null && cloned.scores.length > 0) {
            cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        }
        
        if (cloned.car != null) {
            //String model
            //String은 변하지 않음 
            //String str = "BMW" -> 0x100번지 일때;
            //str = "Audi" -> 0x100번지가 수정되는게 아니라, 0x150번지에 새로 만들어서 참조;
            //따라서 cloned.car.model 과 original.car.model은 서로 영향X (StringBuilder는 수정하기때문에 서로 영향O)
            // -> 깊은복사
            cloned.car = new Car(this.car.model);
        }
        return cloned;
    }
}
