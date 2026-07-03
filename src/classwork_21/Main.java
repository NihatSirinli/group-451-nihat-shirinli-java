package classwork_21;

public class Main {
	public static void main(String[] args) {
		//1
		int age = 100;
		if(age < 12) {
			System.out.println("Ребёнок");
		}else if(age >= 12 && age <= 17) {
			System.out.println("Подросток");
		}else if(age >= 18 && age <= 64) {
			System.out.println("Взрослый");
		}else {
			System.out.println("Пенсионер");
		}
		if(age < 0) {
			System.out.println("Error: given age is less than 0");
		}
		
		//2
		int score = 0;
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else if(score < 60) {
			System.out.println("F");
		}
		if(score < 0 || score > 100) {
			System.out.println("Given score is either less than 0 or bigger than 100");
		}
		
		if(score >= 90) {
			System.out.println("Отлично!");
		}
		//3
        int n = 100;

        System.out.println("Таблица умножения для числа " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
        //4
        
        int n1 = 5;

        if (n > 0) {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            System.out.println("Сумма от 1 до " + n + " = " + sum);

            int factorial = 1;
            i = 1;
            int count = 0;

            while (i <= n) {
                factorial *= i;
                i++;
                count++;
            }

            System.out.println("Факториал (while) = " + factorial);
            System.out.println("Количество итераций = " + count);

            factorial = 1;
            i = 1;

            do {
                factorial *= i;
                i++;
            } while (i <= n);

            System.out.println(factorial);

        } else if (n == 0) {
            System.out.println("сумма от 1 до 0 = 0");
        } else {
            System.out.println("факториал для отрицательных чисел не определён!");
        }

        int k = 1;
        int sum = 0;

        System.out.println("промежуточные суммы");

        while (sum <= 500) {
            sum += k;
            System.out.println("k = " + k + ", сумма = " + sum);
            k++;
        }

        System.out.println("наименьшее k в котором сумма впервые превышает 500- " + (k - 1));int[] numbers = {12, 5, 8, 21, 34, 7, 18, 9, 25, 14};
        System.out.print("Массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa += numbers[i];
        }
        System.out.println("Сумма элементов: " + summa);

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Чётных элементов: " + even);
        System.out.println("Нечётных элементов: " + odd);

        double average = (double) sum / numbers.length;
        System.out.println("Среднее арифметическое: " + average);

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

    }
}