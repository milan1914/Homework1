package operators.java;

import java.sql.PseudoColumnUsage;

public class MoreOperations {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 6;

        //if operator
        System.out.println(firstNumber == secondNumber ? "Numbers are equal" : "Numbers are not equal");
        System.out.println(firstNumber > secondNumber ? "First is greater" : "Second is greater");
        System.out.println("-------");

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
            System.out.println(firstNumber + secondNumber);

        } else if (firstNumber > secondNumber){
        System.out.println("First is greater");
        System.out.println(firstNumber - secondNumber);

        } else {
        System.out.println("Second is greater");
        System.out.println(secondNumber - firstNumber);


        }

