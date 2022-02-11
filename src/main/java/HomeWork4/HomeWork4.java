package HomeWork4;

import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
     printNumberFromOneToN(11);notToDivideTo3and7(6);printSumFibonacci(10);
        Scanner scanner = new Scanner(System.in);


        int[] myArray = new int[20];
        System.out.println("The elements of the Array are:");
        for (int i = 0; i < myArray.length; i++){
            myArray [i] = i * 5;
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.printf("Element at index %d : %d%n", i, myArray[i]);
        }
         int sum = 0;
        for (int i = 0; i <myArray.length; i++) {
            sum += myArray[i];
        }
        int averageValue = sum / myArray.length;
        System.out.printf("The average value of the index is : %d%n", averageValue);

            }
            public static void printNumberFromOneToN(int N){
                System.out.println("All the numbers before " + N + " are:");

                for (int i = 0; i < N; i++) {
                    System.out.println(i);
                }
            }  public static void notToDivideTo3and7(int N){
        System.out.println("The following numbers cannot be divided tp 3 and 7:");
        for (int i = 0; i <N;i++) {
            if (i % 3 != 0){
 if (i % 7 !=0){
     System.out.println(i);
    }


        }
     }

     }  public static void printSumFibonacci(int N) {
        int sum = 0;
        int[] numFibonacci = new int[N];
        numFibonacci[0] = 0;
        numFibonacci[1] = 1;
        for (int i = 2; i < numFibonacci.length; i++) {
            numFibonacci[i] = numFibonacci[i - 1] + numFibonacci[i - 2];
        }
        for (int i = 0; i < numFibonacci.length; i++) {
            sum += numFibonacci[i];
        }
        System.out.println("The sum of the Fibonacci numbers till N is " + sum);
    }
}





