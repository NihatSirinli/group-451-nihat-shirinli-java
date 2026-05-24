package classwork_18;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		
		//
		String name = "Nihat";
		System.out.println("Привет, " + name + "!" );
		
		int yearNow = 2026;
		int bornYear = 2013;
		int age = yearNow - bornYear;
		System.out.println("You were born in " + bornYear + " and you are " + age + " years old");
		
		double height = 4.14;
		double width = 5.32;
		
		System.out.println("Площадь = " + width * height);
		
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;
        int totalMinutes = 150;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + "ч " + minutes + "мин");
        
        
        int price = 100;
        
        int discount = 30;
        
        int lastPrice = price - discount;
        		
        System.out.println(lastPrice);
        
        String firstName = "Nihat";
        String secondName = "Shirinli";
        
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
        
        int cel = 100;
        int fahrenheit = cel * 9/5 + 32;
        System.out.println(fahrenheit);
        
        int g = 1211152751;
        
        if(g % 2 == 0) {
        	System.out.println("Even");
        }else {
        	System.out.println("Odd");
        }
        
        int f = 12;
        int h = 122;
        
        if(f > h) {
        	System.out.println("f is bigger");
        }else if(h > f) {
        	System.out.println("H is bigger");
        }else {
        	System.out.println("Error 16271527152791529519529175219529162162961892618261822078271628016280172701827");
        }
        
        
        int jdwba = 156826180;
        
        if(jdwba > 0) {
        	System.out.println("Положительное");
        }else if(jdwba < 0) {
        	System.out.println("Отрицательное");
        }else if(jdwba == 0) {
        	System.out.println("Ноль");
        }
        
        int mark = (int) (Math.random() * 100) + 1;
        
        if(mark >= 90) {
        	System.out.println("A");
        }else if(mark >= 75) {
        	System.out.println("B");
        }else if(mark >= 60) {
        	System.out.println("C");
        }else {
        	System.out.println("F");
        }
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Год " + year + " — високосный.");
                } else {
                    System.out.println("Год " + year + " — не високосный.");
                }
            } else {
                System.out.println("Год " + year + " — високосный.");
            }
        } else {
            System.out.println("Год " + year + " — не високосный.");
        }

        scanner.close();
        
        int k = 10;
        int n = 10;
        int l = 10;
        
        if(k > n && k > l) {
        	System.out.println("K is the biggest");
        }else if(n > k && n > l) {
        	System.out.println("N is the biggest");
        }else if(l > k && l > n) {
        	System.out.println("L is the biggest");
        }
        
        
        Scanner scanner2 = new Scanner(System.in);

        double num1 = scanner2.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner2.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner2.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на ноль невозможно!");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Ошибка");
                break;
        }

        scanner2.close();
        
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Введите вес (кг): ");
        double weight = scanner3.nextDouble();
        
        System.out.print("Введите рост (м): ");
        double heightt = scanner3.nextDouble();

        double vitalityScore = weight / (heightt * heightt);
        System.out.printf("Ваш индекс жизненной энергии: %.2f\n", vitalityScore);

        if (vitalityScore < 18.5) {
            System.out.println("Время набирать силу");
        } else if (vitalityScore < 25) {
            System.out.println("Отличная форма для ТЕБЯ");
        } else if (vitalityScore < 30) {
            System.out.println("Норм потенциал");
        } else {
            System.out.println("О своем здоровье думай жиробас");
        }

        scanner3.close();
        
        
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
    }
        
        int number = 7;
        for (int w = 1; w <= 10; w++) {
            System.out.println(number + "x" + w + " = " + (number * w));
        }
        
        
        int sum = 0;
        int r = 1;

        while (r <= 100) {
            sum += r;
            r++;
        }

        System.out.println("Сумма чисел от 1 до 100: " + sum);
    
    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }
    System.out.println("Старт!");
    
    
    int q = 8;
    int factorial = 1;
    for (int i = 1; i <= q; i++) {
        factorial *= i;
    }

    System.out.println("Факториал числа " + q + " равен " + factorial);
    
    for (int i = 2; i <= 50; i++) {
        boolean isPrime = true;

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print(i + " ");
        }
    }
    
    int numberr = 9875;
    int current = numberr;

    do {
        int sum = 0;
        while (current > 0) {
            sum += current % 10;
            current /= 10;
        }
        current = sum;
    } while (current > 9);

    System.out.println("Цифровой корень числа " + numberr + " равен: " + current);
}
}
