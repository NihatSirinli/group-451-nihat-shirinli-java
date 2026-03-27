package classwork_9;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
	//1
		int a = 0;
		if(a > 0) {
			System.out.println("Положительное");
		}else {
			System.out.println("Отрицательное или ноль");
		}
		
		//2
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int r = s.nextInt();
		
		if(r % 2 == 0) {
			System.out.println("Четное");
		}else {
			System.out.println("Нечетное");
		}
		
		//3
		int b = 2;
		int c = 3;
		System.out.println("Минимальное число это: " + Math.min(b, c));
		
		//4
		Scanner b1 = new Scanner(System.in);
		System.out.println("Enter number");
		int j = s.nextInt();
		if(j >= 18) {
			System.out.println("Совершеннолетний");
		}else {
			System.out.println("Несовершеннолетний");
		}
		
		//5
		int v = (int) Math.round(Math.random() * 100);
		System.out.println(v);
		if(v >= 90 && v <= 100) {
			System.out.println("Отлично");
		}else if(v >= 70 && v <= 89) {
			System.out.println("Хорошо");
		}else if(v >= 50 && v <= 69) {
			System.out.println("Удовлетворительно");
		}else if(v < 50) {
			System.out.println("Не сдал");
		}
		
		//6
		int h = 0;
		int t = 0;
		int k = 0;
		if(h > k && h > t) {
			System.out.println("The biggest number out of 3: " + h);
		}else if(k > h && k > t) {
			System.out.println("The biggest number out of 3: " + k);
		}else if(t > h && t > k) {
			System.out.println("The biggest number out of 3: " + t);
		}else {
			System.out.println("Error");
		}
		
		//7
        Scanner e = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = e.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " — високосный год.");
        } else {
            System.out.println(year + " — не високосный год.");
        }
        
        //10
        double amount = 1200; // Сумма покупки
        double discount = 0;

        if (amount > 1000) {
            discount = 0.10;
        } else if (amount > 500) {
            discount = 0.05;
        }

        double total = amount - (amount * discount);
        
        System.out.println("Итоговая цена: " + total);
        System.out.println("Ваша скидка: " + (discount * 100) + "процентов");
	}
}
