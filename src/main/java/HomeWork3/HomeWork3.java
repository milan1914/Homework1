package HomeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for 1 to 7:");
        int enteredDay = scanner.nextInt();
        printDayOfTheWeek(enteredDay);

        // witch number is greater
        int number1 = 10;
        int number2 = 5;
        int number3 = 3;
        System.out.println(number1 == number2 ? "Numbers are equal" : "number1 is greater than number2");
        System.out.println(number1 == number3 ? "Numbers are equal" : "number1 is greater than number3");
        System.out.println("number1 is greater than number2 and number3");

        //what is the perimeter and the area of a rectangle
        System.out.println("Please enter the height of the rectangle:");
        int height = scanner.nextInt();

        System.out.println("Please enter the length of the rectangle:");
        int length = scanner.nextInt();

        int perimeter = (2 * length) + (2 * height);
        int area = (length * height);

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

        //even or odd
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number you choose is even");
        } else {
            System.out.println("The number you choose is odd");

        }

    }
    //Day of the week
    public static void printDayOfTheWeek(int dayOfTheWeek){


        switch (dayOfTheWeek){
            case 1:
                System.out.println("Selected day is Monday");
                break;
            case 2:
                System.out.println("Selected day is Tuesday");
                break;
            case 3:
                System.out.println("Selected day is Wednesday");
                break;
            case 4:
                System.out.println("Selected day is Thursday");
                break;
            case 5:
                System.out.println("Selected day is Friday");
                break;
            case 6:
                System.out.println("Selected day is Saturday");
                break;
            case 7:
                System.out.println("Selected day is Sunday");
                break;
            default:
                System.out.println("Not correct");
                break;

        }

    }
}

