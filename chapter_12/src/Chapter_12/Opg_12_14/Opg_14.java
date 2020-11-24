/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_12.Opg_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opg_14 {

    public static void main(String[] args) {

        int line = readInFile("Fredrik", new File("C:/Users/spile/IdeaProjects/Prog_Java_Chapter_Opgaver/chapter_12/src/Chapter_12/Opg_12_14/filename.txt"));

        if (line != -1) { System.out.println("'Fredrik' is found at line " + line); }
        else { System.out.println("'Fredrik' is not in the file, or the file does not exist."); }

    }

    public static int readInFile(String line, File file) {

        try {
            Scanner reader = new Scanner(file);

            int currentLine = 0;

            while (reader.hasNextLine()) {

                currentLine++;
                String readLine = reader.nextLine();
                if (line == readLine) { return currentLine; }

            }

            reader.close();

            return -1; // You could throw a FileNotFoundException because it returns the same, but it doesnt make sense because the file can exist but not hte line.
        } catch (FileNotFoundException exception) { return -1; }

    }

}
