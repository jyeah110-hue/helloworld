//src(루트)부터 실행되는 파일까지의 파일경로(파일 시스템)
package e260416.package1;

public class A {
    public int field1;
    //같은폴더안에 다른클래스 사용가능, 상속관계없이 다른폴더 접근X
    int field2;
    private int field3;

    public A() {
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    public void method1() {}
    void method2 () {}
    private void method3() { System.out.println(field3);}
}
