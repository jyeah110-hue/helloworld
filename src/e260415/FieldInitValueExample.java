package e260415;

import e260415.dll.FieldInitValue;

public class FieldInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        //필드 초기화하는 부분이 없기 때문에 필드는 기본값인 상태
        //기본값 != 초기화
        //오류는 안나기때문에 초기화됬다고 착각
        //다른 곳에서 값을 참조할때 오류가 나도 원인파악하기 어려움
        System.out.println("byteField: " + fiv.byteField);
        System.out.println("shortField: " + fiv.shortField);
        System.out.println("intField: " + fiv.intField);
        System.out.println("longField: " + fiv.longField);
        System.out.println("booleanField: " + fiv.booleanField);
        System.out.println("charField: " + fiv.charField);
        System.out.println("floatField: " + fiv.floatField);
        System.out.println("doubleField: " + fiv.doubleField);
        System.out.println("arrField: " + fiv.arrField);
        System.out.println("refField: " + fiv.refField);
    }
}
