package com.brideglabz.stockaccountmanagement;
public class AccountManager {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stock Account Management Program!");

        StockPortfolio portfolio = new StockPortfolio();
        portfolio.selectActivity();
    }
}
/*Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and
the total value of Stock.
Modify class Account to provide a method called debit that withdraws money
from an Account. Ensure that the debit amount does not exceed the
Account’s balance. If it does, the balance should be left unchanged and the
method should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.*/