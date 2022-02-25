package HomeWork6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //write a method that checks if the entered password contains 8 characters,symbol and number
        System.out.println("Please enter a password:");
        String password = scanner.next();

        if (Password_Validation(password)){
            System.out.println("Password accepted");
        }else {
            System.out.println("Invalid Password! Password must be at least 8 symbols and must contain one special character and one number!");
        }
        System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-\n");
        //positive numbers
        System.out.println("Please enter 3 numbers and we will tell you if they are positive numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (checkIfPositive(n1, n2, n3)){
            System.out.println("Numbers are positive.");
        }else{
            System.out.println("At least one number is negative.");
        }
        System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.\n");
        //equal numbers
        System.out.println("Please enter 3 numbers and I will check if all of them are equal:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (checkIfEqual(firstNumber, secondNumber, thirdNumber)){
            System.out.println("Numbers are equal.");
        }else{
            System.out.println("Numbers are not equal.");
        }
        System.out.println("\n-.-.-.-.-.-.-.-.-\n");

        //average numbers
        System.out.println("Please enter two numbers and I will calculate the average of them:");
        double firstNumber2 = scanner.nextDouble();
        double secondNumber2 = scanner.nextDouble();
        System.out.println("The average of the two entered numbers is: " + averageOfTwo(firstNumber2,secondNumber2));
        System.out.println("\n-.-.-.-.-.-.-.-.-.-\n");

        //sum of numbers
        System.out.println("Please enter two numbers and I will calculate the sum of them:");
        double firstNumber3 = scanner.nextDouble();
        double secondNumber3 = scanner.nextDouble();
        System.out.println("The sum of the two entered numbers is: " + sumOfTwo(firstNumber3,secondNumber3));
        System.out.println("\n-.-.-.-.-.-.-.-\n");

        //final task
        System.out.println("Calling second method with the parameters of the first. Result is: " + sumOfTwo(averageOfTwo(2,3),averageOfTwo(6,7)));
    }

    //write a method that check if entered 3 numbers are equal and positive
    public static boolean Password_Validation(String password){
        if (password.length() < 8 ) {
            return false;
        }
        Pattern letter = Pattern.compile("[a-zA-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        Matcher hasLetter = letter.matcher(password);
        Matcher hasDigit = digit.matcher(password);
        Matcher hasSpecial = special.matcher(password);
            return hasLetter.find() && hasDigit.find() && hasSpecial.find();


    }
    public static boolean checkIfPositive(int n1, int n2, int n3) {
        return n1 >= 0 && n2 >= 0 && n3 >= 0;
    }

    public static boolean checkIfEqual(int n1, int n2, int n3) {
        return n1 == n2 && n2 == n3;
    }

    public static double averageOfTwo(double n1, double n2){
        return (n1 + n2) / 2;
    }

    public static double sumOfTwo(double n1, double n2) {
        return n1 + n2;
    }

}
