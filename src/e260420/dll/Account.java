package e260420.dll;

public class Account {
    private long balance;

    public long getBalance() {
        return this.balance;
    }

    public void deposit (int money) {
        this.balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if (this.balance <money) {
            //비지니스로직으로 직접 exception처리하는 로직 만든것 
            throw new BalanceInsufficientException("잔고부족: " + (money - this.balance) + "원 모자람");
        }
        this.balance =- money;
    }
}
