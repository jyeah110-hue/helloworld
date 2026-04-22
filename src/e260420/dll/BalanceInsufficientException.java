package e260420.dll;

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {}
    public BalanceInsufficientException(String message) {
        //Exception(String message); : 부모생성자 호출
        // ->클래스명이기 때문에 당연히 이름 다름
        // ->override랑 헷갈리지 말자
        super(message);
    }
}
