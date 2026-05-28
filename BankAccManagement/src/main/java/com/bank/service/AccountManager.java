package com.bank.service;

import com.bank.model.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully!");
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public boolean deleteAccount(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            return true;
        }
        return false;
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("--- All Accounts ---");
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}
