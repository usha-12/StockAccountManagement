package com.brideglabz.stockaccountmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<Stock> listOfStock = new ArrayList<>();
    private static int balance = 1000;
    static Scanner sc = new Scanner(System.in);
    public StockPortfolio(ArrayList<Stock> listOfStock){
        this.listOfStock = listOfStock;
    }
    public StockPortfolio(){
        super();
    }

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "listOfStock=" + listOfStock +
                '}';
    }
    public void addToPortfolio(Stock stock){
        this.listOfStock.add(stock);
    }

    public void displayPortfolio(){
        System.out.println("\nDisplay Stock Portfolio............\n");
        System.out.println("STOCK\tVALUE\tSHARES\tPRICE");
        for (Stock stockToPrint : this.listOfStock){
            System.out.println(stockToPrint.getName() +"\t"+ stockToPrint.getNumberOfShare());
        }
    }
    public void displayStockReport(){
        System.out.println("\n\nSTOCK REPORT");
        displayPortfolio();
        System.out.println("\n\nTotal Stock Value : $" + calculateTotalValue());
    }
    public int calculateTotalValue(){
        int totalValue = 0;
        for (Stock stock : this.listOfStock){
            totalValue = totalValue+stock.getValue();
        }
        return totalValue;
    }

    public void debit(){
        System.out.println("\nBalance amount :" +balance);
        System.out.println("Enter the amount to be withdrawn :");
        int debit = sc.nextInt();
        if (balance - debit > 0){
            balance = balance - debit;
            System.out.println("\nDebit Successful!......");
            System.out.println("Balance amount :" +balance);
        }
        else
            System.out.println("\nInsufficient fund.\nDebit amount exceed account balance.\nDebit failure.");
    }
    public int getActivityChoice(){
        int input = 0;
        do {
            System.out.println("\nSelect the activity you would like to perform.");
            System.out.println("1. Add stocks");
            System.out.println("2. Display stock report");
            System.out.println("3. Debit from Account");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice : ");
            input = sc.nextInt();
            if (!(input >=1 && input <= 4))
                System.out.println("\nInvalid choice!\nPlease try again.\n");
        }while (!(input >= 1 && input <= 4));
        return input;
    }

    public void selectActivity() {
        int choice = 0;
        while (choice != 4) {
            choice = getActivityChoice();

            switch (choice) {
                case 1:
                    Stock stockObj = new Stock();
                    stockObj.addStocks(new StockPortfolio(listOfStock));
                    break;

                case 2:
                    displayStockReport();
                    break;

                case 3:
                    debit();
                    break;

                case 4:
                    System.out.println("\nExiting Stock Account Management Program.");
                    break;
            }
        }
    }
}
