/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_12.Opg_12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opg_13 {

    // Useful link: https://www.javatpoint.com/command-line-argument

    public static void main(String[] args) throws FileNotFoundException {

        // readFile("C:/Users/spile/IdeaProjects/Prog_Java_Chapter_Opgaver/chapter_12/src/Chapter_12/Opg_12_13/Random.txt");
        // readFile(new File("C:/Users/spile/IdeaProjects/Prog_Java_Chapter_Opgaver/chapter_12/src/Chapter_12/Opg_12_13/Random.txt"));
        readFile(args[0]);

    }

    public static void readFile(String filePath) throws FileNotFoundException {

        int chars = 0;
        int words = 0;
        int lines = 0;

        File file = new File(filePath);
        Scanner reader = new Scanner(file);

        while (reader.hasNext()) {

            String word = reader.next();
            chars += word.length();
            words++;

        }

        Scanner lineReader = new Scanner(file);

        while (lineReader.hasNextLine()) {

            String placeholder = lineReader.nextLine();
            lines++;

        }

        reader.close();
        lineReader.close();

        System.out.printf(
                "File %s has\n" +
                "%d characters\n" +
                "%d words\n" +
                "%d lines",
                file.getName(),
                chars, words, lines
        );

    }


    // Did not know if this was useful in any way, but made it anyways.
    public static void readFile(File file) throws FileNotFoundException {

        int chars = 0;
        int words = 0;
        int lines = 0;

        Scanner reader = new Scanner(file);

        while (reader.hasNext()) {

            String placeholder = reader.next();
            chars += placeholder.length();
            words++;

        }

        Scanner lineReader = new Scanner(file);

        while (lineReader.hasNextLine()) {

            String placeholder = lineReader.nextLine();
            lines++;

        }

        reader.close();
        lineReader.close();

        System.out.printf(
                "File %s has\n" +
                "%d characters\n" +
                "%d words\n" +
                "%d lines",
                file.getName(),
                chars, words, lines
        );

    }

}
