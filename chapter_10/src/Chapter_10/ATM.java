/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 03-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

import java.util.Date;
import java.util.Scanner;

// Opg. 10.7
public class ATM {

    enum booleanState {
        TRUE, FALSE, EXIT;
    }

    public static void main(String[] args) {

        // Account setup
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].setId(i);
            accounts[i].setBalance(100);
        }

        // Scanner
        Scanner input = new Scanner(System.in);

        while (true) {

            boolean exitAccount = false;
            while (!exitAccount) {

                // Id checker
                System.out.print("Enter an account id: ");
                Account account;
                while (true) {

                    int id = input.nextInt();
                    if (idValidator(id, accounts)) {
                        account = accounts[id];
                        break;
                    }
                    System.out.print("Enter a correct account id: ");

                }

                // Menu and actions
                while (true) {
                    menu();
                    booleanState state = choice(input.nextInt(), account, input);
                    if (state == booleanState.EXIT) {
                        exitAccount = true;
                        break;
                    }
                } // end of menu-while loop

            } // end of account-while loop

        } // end ATM while loop

    } // end of main (psvm)

    private static boolean idValidator(int id, Account[] accounts) {
        for (Account currentAccount : accounts) {
            if (id == currentAccount.getId()) {return true;}
        }
        return false;
    }

    private static void menu() {
        System.out.print(
                "Chapter_11.Opg_11_1.Main menu\n" +
                "1: Check balance\n" +
                "2: Withdraw\n" +
                "3: Deposit\n" +
                "4: Exit\n" +
                "Enter a choice: "
        );
    }

    private static booleanState choice(int menuChoice, Account account, Scanner input) {

        switch (menuChoice) {
            case 1: {
                System.out.println("The balance is " + account.getBalance());
                return booleanState.TRUE;
            }
            case 2: {
                System.out.println("Enter an amount to withdraw: ");
                account.withdraw(input.nextDouble());
                return booleanState.TRUE;
            }
            case 3: {
                System.out.println("Enter an amount to deposit: ");
                account.deposit(input.nextDouble());
                return booleanState.TRUE;
            }
            case 4: {
                return booleanState.EXIT;
            }
            default: {
                return booleanState.FALSE;
            }
        }

    }

}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate; // a percentage fx. 4.5%
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
