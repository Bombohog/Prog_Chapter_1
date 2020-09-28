/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 28-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_28_09_2020;

import java.util.Scanner;

public class ClassTest {
    
    public static void main(String[] args) {

        Student[] students = StudentCreation();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name, middlename(if any) or a lastname of a person in your student group: ");

        String enteredInput = input.nextLine();
        
        switch (enteredInput) {
            case "Lasse" -> System.out.println("Name: " + students[0].name + " " + students[0].middleName + " " + students[0].lastName + "\nAge: " + students[0].age);
            case "Fredrik" -> System.out.println("Name: " + students[1].name + " " + students[1].middleName + " " + students[1].lastName + "\nAge: " + students[1].age);
            case "Deniz" -> System.out.println("Name: " + students[2].name + " " + students[2].middleName + " " + students[2].lastName + "\nAge: " + students[2].age);
            case "Simon" -> System.out.println("Name: " + students[3].name + " " + students[3].middleName + " " + students[3].lastName + "\nAge: " + students[3].age);
            default -> {
                for (Student i : students) {
                    if (enteredInput == i.middleName || enteredInput == i.lastName) {
                        System.out.println("Name: " + i.name + " " + i.middleName + " " + i.lastName + "\nAge: " + students[0].age);
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

        Student fredrik = new Student();
        fredrik.name = "Fredrik";
        fredrik.middleName = "";
        fredrik.lastName = "";
        fredrik.age = 22;

        Student deniz = new Student();
        deniz.name = "Deniz";
        deniz.middleName = "";
        deniz.lastName = "";
        deniz.age = 22;

        Student simon = new Student();
        simon.name = "Simon";
        simon.middleName = "";
        simon.lastName = "";
        simon.age = 22;

        return new Student[]{lasse, fredrik, deniz, simon};
    }

}

class Student {

    public static String name;
    public static String middleName;
    public static String lastName;
    public static int age;

}
