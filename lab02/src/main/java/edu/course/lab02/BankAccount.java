package edu.course.lab02;

public class BankAccount {

    private int balance;

    public BankAccount(int balance){
        if(balance < 0)
            throw new IllegalArgumentException("Баланс не может быть отрицательным изначально.");
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount <= 0)
            throw new IllegalArgumentException("Депозит не может быть неотрицательным.");
        balance += amount;
    }

    public void withdraw(int amount){
        if(amount>balance)
            throw new IllegalArgumentException("Сумма списания больше нынешнего баланса.");
        if(amount<=0)
            throw new IllegalArgumentException("Сумма списания не может быть меньше или равняться нулю.");
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }
}
