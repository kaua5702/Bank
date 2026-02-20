package com.kauabiscotto.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String ag;
    private List<Account> accounts;
    private int lastAccount = 1;

    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void insertAccount(Account account) {
        accounts.add(account);
    }

    public Account generateAccount(String name) {
        Account account = new Account(ag, "" + lastAccount, name);
        lastAccount ++;
        return account;
    }

    public void outputTotal() {
        double total = 0;
        for (Account account : accounts) {
            double balance = account.getBalance();
            total += balance;
        }
        System.out.println("Banco possuí agora: R$ " + total);
    }

}
