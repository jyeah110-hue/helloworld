package e260416;

import e260416.dll.DmbCellPhone;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);

        //CellPhone으로부터 상속받은 필드
        //자식클래스는 메타데이터로 부모클래스 주소저장
        //논리적으로는 부모-자식 같은공간(그래서 this사용 가능), 물리적(부모 0x100, 자식 0x1000)으로는 다른공간
        System.out.println("모델: " + dmb.model);
        System.out.println("색상: " + dmb.color);

        System.out.println("채널: " + dmb.channel);

        dmb.powerOn();
        dmb.bell();
        dmb.sendVoice("여보세요?");
        dmb.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        dmb.sendVoice("아~ 예! 반갑습니다.");
        dmb.hangUp();

        dmb.turnOnDmb();
        dmb.changeCannelDmb(12);
        dmb.turnOffDmb();
    }
}
