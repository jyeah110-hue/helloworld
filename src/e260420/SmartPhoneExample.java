package e260420;

import e260420.dll.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("구글", "안드로이드");
        String strObj = phone.toString();
        System.out.println(strObj);
        System.out.println(phone);
    }
}
