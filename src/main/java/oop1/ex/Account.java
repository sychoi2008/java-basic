package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        //System.out.println("increase your money!");
        balance += amount;
    }

    void withdraw(int amount) {
        if(balance-amount >= 0) {
            balance -= amount;
            //System.out.println("withdraw ok");
            //System.out.println("balance : " + balance);
        } else {
            System.out.println("You don't withdraw!");
            System.out.println("balance : "+ balance);
        }
    }

}
