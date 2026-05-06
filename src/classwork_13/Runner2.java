package classwork_13;

import java.util.Scanner;

public class Runner2 {
	public static void main(String[] args) {
		//1
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		//2
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i);
        }
        //3
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        
        //4
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        //5
        int e = 10;
        while (e >= 1) {
            System.out.print(e + " ");
            e--;
        }
        
        //6
        int num = 58342;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        //7
        int gg = 4567;
        int summa = 0;

        while (number != 0) {
            summa = summa + (number % 10);
            gg = gg / 10;
        }

        System.out.println(sum);
        //8
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Начать игру\n2. Настройки\n3. Выйти");
            choice = s.nextInt();
        } while (choice != 3);
        //10
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; 
            }
            System.out.println(i);
        }
        //11
        for (int i = 1; i <= 100; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
	}
