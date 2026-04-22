package e260416.dll;

public class Student extends People {
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        //만약 부모클래스에 매개변수를 받는 생성자만 있다면
        //super를 통해 부모객체를 생성해줘야한다.
        //부모생성자가 기본형일때는 super사용안해도 된다.
        super(name, ssn);

        this.studentNo = studentNo;
    }
}
