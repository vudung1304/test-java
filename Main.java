package eBanking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBank SourceAccount = new AccountBank();
        System.out.println("Create new account: ");
        System.out.println("-----------------------");
        System.out.println("Enter source account number");
        String AccountNumber = sc.nextLine();
        System.out.println("Enter account holder name");
        String AccountHolderName = sc.nextLine();
        System.out.println("Enter Initial Balance for Source Account");
        double InitialBalance = sc.nextDouble();
        System.out.println("\nSource account details:");
        SourceAccount.displayAccountInformation();
        AccountBank accountBank = new AccountBank();
        System.out.println("Enter source account number");
        String DestinationAccountNumber = sc.nextLine();
        System.out.println("Enter destination account holder name");
        String DestinationAccountHolderName = sc.nextLine();
        System.out.println("Enter Initial Balance for Source Account");
        double Balance = sc.nextDouble();
        System.out.println("\nEnter amount to withdraw from source account:");
        double WithdrawAmount = sc.nextDouble();
        System.out.println("\nEnter the transaction amount:");
        double TransactionAmount = sc.nextDouble();
        System.out.println("\nUpdating account balance");



    }


}
