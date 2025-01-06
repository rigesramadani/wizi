package org.example;

import org.example.Account;

class AccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        Account account = new Account();
        account.deposit(400);
        account.checkBalance();
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        account.checkBalance();
    }

    @org.junit.jupiter.api.Test
    void checkBalance() {
        Account account = new Account();
        account.deposit(300);
        account.checkBalance();
    }

    @org.junit.jupiter.api.Test
    void transfer() {
        Account account1 = new Account();
        Account account2 = new Account();
        account1.deposit(400);
        account1.transfer(account2, 30);
        account1.checkBalance();
        account2.checkBalance();
    }
}