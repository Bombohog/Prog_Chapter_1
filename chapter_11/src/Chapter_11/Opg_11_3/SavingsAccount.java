/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_3;

public class SavingsAccount extends Account {

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Denied: Insufficient funds.\nYou cant withdraw " + amount + " from your balance: " + this.getBalance());
        }
    }

}
