package com.ATM;

import java.util.Scanner;

public class AutomatedTellerMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String accNumStr = "", pinStr = "", menu, menuInput;
        int input;

        System.out.println("Welcome!");
        System.out.println("Please enter your account number: ");
        accNumStr = sc.nextLine();

        System.out.println("Enter your pin: ");
        pinStr = sc.nextLine();

        menu = "Main menu\n\t1 - View my balance\n\t2 - Withdraw cash\n\t3 - Deposit funds\n\t4 - Exit\nEnter a choice.";
        System.out.println(menu);
        menuInput = sc.nextLine();
        input = validateNumber(menuInput);
        switch (input){
            case 2:
                withdrawalMenu();
                break;
        }

    }
    static int validateNumber(String nStr){

        int n = 0;
        try{
            n = Integer.parseInt(nStr);
        }
        catch (Exception ex){
            System.out.println("Failure to convert from str to number.");
        }
        return n;
    }
    static void withdrawalMenu(){
        String menu = "Withdrawal menu\n\t1 - $20\t4 - $100\n\t2 - $40\t5 - $200\n\t3 - $60\t6 - Cancel transaction\nChoose a withdrawal amount: ";
        System.out.println(menu);
    }
}
