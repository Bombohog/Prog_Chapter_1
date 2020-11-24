/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 20-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_12.Opg_12_25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] data = readUniversitySalaries();

        double totalAssistantSalary = data[0];
        double totalAssociateSalary = data[1];
        double totalFullSalary = data[2];
        double totalFacultySalary = data[3];

        double averageAssistantSalary = data[0] / data[4];
        double averageAssociateSalary = data[1] / data[5];
        double averageFullSalary = data[2] / data[6];
        double averageFacultySalary = data[3] / data[7];

        System.out.println("Total salary:");
        System.out.println("Assistant professors " + totalAssistantSalary);
        System.out.println("Associate professors  " + totalAssociateSalary);
        System.out.println("Full professors " + totalFullSalary);
        System.out.println("Faculty " + totalFacultySalary);

        System.out.println("\nAverage salary:");
        System.out.println("Assistant professors " + averageAssistantSalary);
        System.out.println("Associate professors  " + averageAssociateSalary);
        System.out.println("Full professors " + averageFullSalary);
        System.out.println("Faculty " + averageFacultySalary);

    }

    static double[] readUniversitySalaries() {

        double totalAssistantSalary = 0;
        double totalAssociateSalary = 0;
        double totalFullSalary = 0;
        double totalFacultySalary = 0;

        int amountOfAssistants = 0;
        int amountOfAssociates = 0;
        int amountOfFulls = 0;
        int amountOfFaculty = 0;

        try {

            URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            input.useLocale(Locale.ENGLISH); /* This was a fix for a problem i had
            The reason is that it used the local language on my computer: Danish,
            but in danish we describe/recognise decimals with ',' and not '.'
            therefore i had to change the scanner to use english ref-language instead. */
            while (input.hasNext()) {

                // Tried learning input.skip() but could'nt get it to work.
                String firstName = input.next();
                String lastName = input.next();
                String rank = input.next();
                double salary = input.nextDouble();

                switch (rank) {
                    case "assistant":
                        totalAssistantSalary += salary;
                        amountOfAssistants++;
                        break;
                    case "associate":
                        totalAssociateSalary += salary;
                        amountOfAssociates++;
                        break;
                    case "full":
                        totalFullSalary += salary;
                        amountOfFulls++;
                        break;
                }

                totalFacultySalary += salary;
                amountOfFaculty++;

            }

            input.close();

        } catch (MalformedURLException ex) {

            System.out.println("Invalid URL.");

        } catch (IOException ex) {

            System.out.println("I/O Errors: no such file.");

        }

        return new double[]{totalAssistantSalary, totalAssociateSalary, totalFullSalary, totalFacultySalary, amountOfAssistants, amountOfAssociates, amountOfFulls, amountOfFaculty};
    }

}
