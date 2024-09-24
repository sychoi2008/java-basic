package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public method : deposit(입금)
    public void deposit(int amount) {
        if(isAmountValid(amount)) balance += amount;
        else System.out.println("no valid amount");
    }

    // public method : withdraw(출금)
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else System.out.println("no valid amount or you are short of balance");

    }

    // public method : 잔금 조회
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
