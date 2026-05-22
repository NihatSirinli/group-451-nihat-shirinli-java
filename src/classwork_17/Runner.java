package classwork_17;

import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
	}
		for (int i = 1; i <= 9; i++) {
		    for (int j = 1; j <= 9; j++) {
		        System.out.print((i * j));
		    }  
		}
		
		int sum = 0;
		int a = 1;

		while (a <= 100) {
		    sum += a;
		    a++;
  }
		
		int i = 10;

		do {
		    System.out.println(i);
		    i--;
		} while (i >= 1);

		System.out.println("Старт!");
		for (int n = 1; n <= 5; n++) {
		    for (int b = 1; b <= n; b++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		        Scanner scanner = new Scanner(System.in);
		        int target = (int) (Math.random() * 20) + 1; 
		        int guess = 0;

		        while (guess != target) {
		            System.out.print("Введите число от 1 до 20: ");
		            guess = scanner.nextInt();

		            if (guess < target) {
		                System.out.println("Больше");
		            } else if (guess > target) {
		                System.out.println("Меньше");
		            }
		        }

		        System.out.println("Вы угадали!");
		        scanner.close();
		        
		        Scanner scanner1 = new Scanner(System.in);
		        
		        System.out.print("Введите число: ");
		        int number = scanner1.nextInt();

		        if (number % 2 == 0) {
		            System.out.println("Чётное");
		        } else {
		            System.out.println("Нечётное");
		        }

		        scanner1.close();
		        
		        int k = 10;
		        int g = 11;
		        int f = 0;
		        
		        if(k > g && k > f) {
		        	System.out.println(k + "Is the biggest");
		        }else if(g > k && g > f) {
		        	System.out.println(g + "Is the biggest");
		        }else if(f > k && f > g) {
		        	System.out.println(f + "Is the biggest");
		        	
		        	
		        	int note = 100;
		        	if(note <= 100 && note >= 90) {
		        		System.out.println("Отлично");
		        	}else if(note <= 89 && note >= 70) {
		        		System.out.println("Хорошо");
		        	}else if(note <= 69 && note >= 50) {
		        		System.out.println("Удовлетворительно");
		        	}else if(note < 50) {
		        		System.out.println("Неудовлетворительно");
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

		            System.out.print("Введите год: ");
		            int year = scanner3.nextInt();

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

		            scanner3.close();
		        }
		        
		        int month = 5; 
		        int day = 22;

		        String zodiac = "";

		        switch (month) {
		            case 1:
		                if (day >= 1 && day <= 19) zodiac = "Козерог";
		                else if (day >= 20 && day <= 31) zodiac = "Водолей";
		                break;
		            case 2:
		                if (day >= 1 && day <= 18) zodiac = "Водолей";
		                else if (day >= 19 && day <= 29) zodiac = "Рыбы";
		                break;
		            case 3:
		                if (day >= 1 && day <= 20) zodiac = "Рыбы";
		                else if (day >= 21 && day <= 31) zodiac = "Овен";
		                break;
		            case 4:
		                if (day >= 1 && day <= 19) zodiac = "Овен";
		                else if (day >= 20 && day <= 30) zodiac = "Телец";
		                break;
		            case 5:
		                if (day >= 1 && day <= 20) zodiac = "Телец";
		                else if (day >= 21 && day <= 31) zodiac = "Близнецы";
		                break;
		            case 6:
		                if (day >= 1 && day <= 20) zodiac = "Близнецы";
		                else if (day >= 21 && day <= 30) zodiac = "Рак";
		                break;
		            case 7:
		                if (day >= 1 && day <= 22) zodiac = "Рак";
		                else if (day >= 23 && day <= 31) zodiac = "Лев";
		                break;
		            case 8:
		                if (day >= 1 && day <= 22) zodiac = "Лев";
		                else if (day >= 23 && day <= 31) zodiac = "Дева";
		                break;
		            case 9:
		                if (day >= 1 && day <= 22) zodiac = "Дева";
		                else if (day >= 23 && day <= 30) zodiac = "Весы";
		                break;
		            case 10:
		                if (day >= 1 && day <= 22) zodiac = "Весы";
		                else if (day >= 23 && day <= 31) zodiac = "Скорпион";
		                break;
		            case 11:
		                if (day >= 1 && day <= 21) zodiac = "Скорпион";
		                else if (day >= 22 && day <= 30) zodiac = "Стрелец";
		                break;
		            case 12:
		                if (day >= 1 && day <= 21) zodiac = "Стрелец";
		                else if (day >= 22 && day <= 31) zodiac = "Козерог";
		                break;
		            default:
		                zodiac = "Ошибка";
		                break;
		        }

		        if (zodiac.isEmpty() || zodiac.equals("Ошибка!!")) {
		            System.out.println("Ошибкa введена несущуствющая дата!!!");
		        } else {
		            System.out.println("Знак зодиака: " + zodiac);
		        }
		        
		        Scanner scanner4 = new Scanner(System.in);

		        System.out.print("Введите три стороны треугольника через «Space»: ");
		        int a1 = scanner4.nextInt();
		        int b = scanner4.nextInt();
		        int c = scanner4.nextInt();

		        if (a1 + b > c && a1 + c > b && b + c > a1) {
		            System.out.print("Треугольник существует, тип: ");

		            if (a1 == b && b == c) {
		                System.out.println("равносторонний");
		            } else if (a1 == b || b == c || a1 == c) {
		                System.out.println("равнобедренный");
		            } else {
		                System.out.println("разносторонний");
		            }
		        } else {
		            System.out.println("Такой треугольник построить нельзя!");
		        }

		        scanner4.close();
		        
		        
		        int[] numbers = {7, 13, 42, 69, 100};

		        for (int n = 0; n < numbers.length; n++) {
		            System.out.println("[" + n + "] = " + numbers[n]);
		        }
		        
		        double[] grades = {4.5, 5.0, 3.8, 4.2, 4.7, 3.5, 5.0, 4.0, 4.8, 4.3};
		        
		        double summa = 0.0;

		        for (int h = 0; h < grades.length; h++) {
		            summa += grades[h];
		        }

		        double average = summa / grades.length;

		        System.out.println("Сумма оценок: " + summa);
		        System.out.println("Среднее арифметическое: " + average);
		        
		        
		        Scanner scanner5 = new Scanner(System.in);

		        int computerChoice = (int) (Math.random() * 3) + 1;

		        System.out.println("Сделайте ваш выбор:");
		        System.out.println("1 - Камень");
		        System.out.println("2 - Ножницы");
		        System.out.println("3 - Бумага");
		        System.out.print("Введите число (1-3): ");
		        int playerChoice = scanner5.nextInt();

		        if (playerChoice < 1 || playerChoice > 3) {
		            System.out.println("Ошибка: некорректный выбор!");
		            scanner5.close();
		            return;
		        }

		        System.out.print("Компьютер выбрал: ");
		        if (computerChoice == 1) System.out.println("Камень");
		        else if (computerChoice == 2) System.out.println("Ножницы");
		        else System.out.println("Бумага");

		        if (playerChoice == computerChoice) {
		            System.out.println("Ничья!");
		        } else if ((playerChoice == 1 && computerChoice == 2) || (playerChoice == 2 && computerChoice == 3) || (playerChoice == 3 && computerChoice == 1)) {
		            System.out.println("Вы выиграли!");
		        } else {
		            System.out.println("Компьютер выиграл!");
		        }

		        scanner5.close();
		        
		        Student student1 = new Student("Алексей", 20, 4.8);
		        Student student2 = new Student("Мария", 19, 4.2);

		        student1.displayInfo();
		        student2.displayInfo();
		        
		        Rectangle rect1 = new Rectangle(5.0, 10.0);
		        Rectangle rect2 = new Rectangle(3.5, 4.5);

		        rect1.displayParameters();
		        rect2.displayParameters();
		    }
		    }