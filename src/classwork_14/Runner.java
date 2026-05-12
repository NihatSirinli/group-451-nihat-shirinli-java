package classwork_14;

import java.util.Iterator;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите пароль.");
//        String n = scanner.nextLine();
//        if(n.length() < 8) {
//        	System.out.println("Error");
//        }
//        for(int a = 0; a < n.length(); a++) {
//        System.out.println(n.split("")[a]);
//        }
//        
//        for (int i = 0; i < n.length(); i++) {
//        	char characterr;
		
		
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        int newNumber = 0;
//        int place = 1;
//        int count = 0;
//
//        while (number > 0) {
//
//            int digit = number % 10;
//
//            if (digit == 9) {
//                digit = 0;
//            } else {
//                digit = digit + 1;
//            }
//
//            newNumber = digit + newNumber;
//
//            number = number / 10;
//            count++;
//        }
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(i);
            }
        }
        
        scanner.close();
        }
	}
