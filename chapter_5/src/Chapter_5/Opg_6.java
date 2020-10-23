/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 01-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

public class Opg_6 {

    public static void main(String[] args) {

        int squareMeter = 30;

        System.out.printf("%-10s%-10s%-5s%-15s%-10s", "Ping", "Square meter", "", "Square meter", "Ping");
        for (int ping = 10; ping < 80; ping += 5) {

            System.out.println("");
            System.out.printf("%-10s%-14.3f%-3s%-15s%-10.3f", ping, ((double)ping * 3.305), "|", squareMeter, ((double)squareMeter / 3.305));
            squareMeter += 5;
            ping += 5;

        }

    }

}
