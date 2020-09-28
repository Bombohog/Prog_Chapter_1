/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 28-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_28_09_2020;

import java.util.*;

public class ClassTest {
    
    public static void main(String[] args) {

        Student[] students = StudentCreation();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name, middlename(if any) or a lastname of a person in your student group: ");

        String enteredInput = input.nextLine();
        
        switch (enteredInput.toLowerCase()) {
            case "lasse" -> System.out.println("Name: " + students[0].name + " " + students[0].middleName + " " + students[0].lastName +
                    "\nAge: " + students[0].age + "\nLives in: " + students[0].city + "\nAcademics: " + students[0].academics);
            case "fredrik" -> System.out.println("Name: " + students[1].name + " " + students[1].middleName + " " + students[1].lastName +
                    "\nAge: " + students[1].age + "\nLives in: " + students[1].city + "\nAcademics: " + students[1].academics);
            case "deniz" -> System.out.println("Name: " + students[2].name + " " + students[2].middleName + " " + students[2].lastName +
                    "\nAge: " + students[2].age + "\nLives in: " + students[2].city + "\nAcademics: " + students[2].academics);
            case "simon" -> System.out.println("Name: " + students[3].name + " " + students[3].middleName + " " + students[3].lastName +
                    "\nAge: " + students[3].age + "\nLives in: " + students[3].city + "\nAcademics: " + students[3].academics);
            default -> {
                for (Student i : students) {
                    if (enteredInput.equals(i.middleName) || enteredInput.equals(i.lastName)) {
                        System.out.println("Name: " + i.name + " " + i.middleName + " " + i.lastName +
                                "\nAge: " + i.age + "\nLives in: " + i.city + "\nAcademics: " + i.academics);
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            }
        }

    }

    public static Student[] StudentCreation() {
        
        Student lasse = new Student();
        lasse.name = "Lasse";
        lasse.middleName = "Jørgensen";
        lasse.lastName = "Kongsdal";
        lasse.age = 22;
        lasse.city = "Skuderløse";
        lasse.academics = "AP Graduate";

        Student fredrik = new Student();
        fredrik.name = "Fredrik";
        fredrik.middleName = "";
        fredrik.lastName = "Bille";
        fredrik.age = 24;
        fredrik.city = "Nykøbing Falster";
        fredrik.academics = "AP Graduate";

        Student deniz = new Student();
        deniz.name = "Deniz";
        deniz.middleName = "Yahya";
        deniz.lastName = "Yandim";
        deniz.age = 20;
        deniz.city = "Vordingborg";
        deniz.academics = "AP Graduate";

        Student simon = new Student();
        simon.name = "Simon";
        simon.middleName = "Stentoft";
        simon.lastName = "Heegaard";
        simon.age = 24;
        simon.city = "Faxe";
        simon.academics = "AP Graduate";

        return new Student[]{lasse, fredrik, deniz, simon};
    }

}

class Student {

    public String name;
    public String middleName;
    public String lastName;
    public int age;
    public String city;
    public String academics;

}
