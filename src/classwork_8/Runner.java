package classwork_8;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int t = 4;
		if(t % 2 == 0) {
			System.out.println("Число четное");
		}else {
			System.out.println("Число нечетное");
		}
		
		
		int sum = 0;
		
		int n = 5;
		
		for(int i = 1; i < n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		int blabla = 0;
		int bleble = 0;
		int blebleblabla = blabla * bleble;
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int r = s.nextInt();
		System.out.println("Enter second number");
		int n1 = s.nextInt();
		System.out.println("Enter third number");
		int j = s.nextInt();
		System.out.println("Enter fourth number");
		int k = s.nextInt();
		System.out.println("Enter fifth number");
		int l = s.nextInt();
		
		if(r > n1 && r > j && r > k && r > l) {
			System.out.println("Самое большое число: " + r);
		}else if(n1 > r && n1 > j && n1 > k && n1 > l) {
			System.out.println("Самое большое число: " + n);
		}else if(j > r && j > n1 && j > k && j > l) {
			System.out.println("Самое большое число: " + j);
		}else if(k > r && k > n1 && k > j && k > l) {
			System.out.println("Самое большое число: " + k);
		}else if(l > r && l > n1 && l > j && l > k) {
			System.out.println("Самое большое число: " + l);
		}else {
			System.out.println("Error 404");
		}
		
		long b = Math.round(Math.random() * 100);
		while(b != 100) {
			if(b < 100) {
				System.out.println("Меньше");
			}else if(b > 100) {
				System.out.println("Больше");
			}else if(b == 100) {
				System.out.println("Ты угадал!");
				break;
			}
		}
		System.out.println(b);
	}
}
