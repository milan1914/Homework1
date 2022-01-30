package homeWork1;

import java.util.Scanner;

public class MyFirstHomework {


    public static void main(String[] args) {
        //writes the text in the console
        System.out.println("Please enter your name");
        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);
        //a string variable that will store the value entered from the user
        String firstName = scanner.next();

        System.out.println("Please enter your last name");
        String lastName = scanner.next();

        System.out.println("Please enter your age");
        // integer variable that will store the age entered from the user
        int userAge = scanner.nextInt();

        System.out.println("Please tell us what is your hobby");
        String hobby = scanner.next();

        System.out.println(" Your name is " + firstName + " " + lastName + " you are " + userAge +
                 " and your hobby is: " + hobby);







    }

















    }


