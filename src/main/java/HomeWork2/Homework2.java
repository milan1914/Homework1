package HomeWork2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String testString = "My name is <MyName>";

        System.out.println("What is your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String newString = testString.replace("<MyName>", name);
        System.out.println("First string: " + testString);
        System.out.println("New String: " + newString);

        System.out.println("Please enter your age ");
        String str1 = scanner.nextLine();
        System.out.println("Please enter your grandmother`s age ");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("\""+ str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        }
        else{
            System.out.println(str1 + " is not equal to " + str2);
        }

        String [] stringArray = testString.split(" ");
        System.out.println(testString + " has " + stringArray.length + " words ");


        System.out.println("Please enter your dog`s name: ");
        String firstString = scanner.nextLine();
        System.out.println("Please enter your dog`s breed: ");
        String secondString = scanner.nextLine();


        String strConcatenation = firstString.concat(" " + secondString);
        System.out.println("Your dog`s name and breed are: " + strConcatenation);



    }
}
