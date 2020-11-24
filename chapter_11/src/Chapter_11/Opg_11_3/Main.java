/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_3;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        System.out.println("Normal account: " + account.toString());
        System.out.println("Savings-account: " + savingsAccount.toString());
        System.out.println("Checking-account: " + checkingAccount.toString());

    }

}
