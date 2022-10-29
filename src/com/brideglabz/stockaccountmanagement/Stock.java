package com.brideglabz.stockaccountmanagement;
import java.util.Scanner;

public class Stock{
    String name;
    int numberOfShare;
    int sharePrice;
    int value;
    static Scanner sc = new Scanner(System.in);

    public Stock(String name, int numberOfShare, int sharePrice, int value ) {
        this.name = name;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
        this.value = value;
    }

    public Stock() {

    }

    @Override
    public String toString() {
        return "StockAccountManagement" +
                "name='" + name + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", value=" + value;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public int getValue() {
        return value;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void addStocks(StockPortfolio portfolio){
        System.out.println("\n\nEnter the number of stocks existing in the portfolio :");
        int numberOfStocks = sc.nextInt();
        for (int index = 0; index < numberOfStocks; index++){
            System.out.println("\nStock "+(index+1));
            System.out.println("Enter the name of the stock :");
            String name = sc.next();
            System.out.println("Enter Number of shares :");
            int shares = sc.nextInt();
            System.out.println("Enter the price of the share of this stock :");
            int price = sc.nextInt();
            int value = calculateStockValue(shares, price);
            Stock stock = new Stock(name,shares,price,value);
            portfolio.addToPortfolio(stock);
        }
    }
    public int calculateStockValue(int shares, int stockPrice){

        return (shares * stockPrice);
    }


}