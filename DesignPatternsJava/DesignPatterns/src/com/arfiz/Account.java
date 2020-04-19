package com.arfiz;

public class Account {
    private float balance;

    public void deposite(float amount){
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount){
        if (amount > 0)
            balance -= amount;
    }

}
