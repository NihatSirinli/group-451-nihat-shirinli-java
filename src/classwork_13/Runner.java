package classwork_13;

public class Runner {
	public static void main(String[] args) {
		//1
		int x = 7;
		if(x > 0) {
			System.out.println("Число положительное");
		}else if(x < 0) {
			System.out.println("Число отрицательное");
		}else if(x == 0) {
			System.out.println("Число равно нулю");
		}
		//2
		int y = 2;
		if(y % 2 == 0) {
			System.out.println("Чётное число");
		}else if(y % 2 != 0) {
			System.out.println("Нечётное число");
		}
		
		//3
		int a = 25;
		int b = 31;
		if(a > b) {
			System.out.println(a);
		}else if(b > a) {
			System.out.println(b);
		}else if( b == a) {
			System.out.println("Числа равны");
		}
		
		//4
		
		int age = 17;
		if(age >= 18) {
			System.out.println("Доступ разрешён");
		}else if(age < 18) {
			System.out.println("Доступ запрещён");
		}
		
		//5
		int score = 82;
		if(score >= 90 && score <= 100) {
			System.out.println("Отлично");
		}else if(score >= 70 && score <= 89) {
			System.out.println("Хорошо");
		}else if(score >= 50 && score <= 69) {
			System.out.println("Удовлетворительно");
		}else if(score >= 0 && score <= 49) {
			System.out.println("Не сдал");
		}else if(score < 0 || score > 100) {
			System.out.println("Некорректный балл");
		}
		//6
        String login = "admin";
        String password = "12345";

        if (login.equals("admin") && password.equals("12345")) {
            System.out.println("Вход выполнен");
        } else {
            System.out.println("Ошибка входа");
        }
        //7
        int temperature = 32;

        if (temperature < 0) {
            System.out.println("Очень холодно");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("Прохладно");
        } else if (temperature >= 16 && temperature <= 30) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
        //8
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка: введите число от 1 до 7");
                break;
        }
        //9
        int a1 = 20;
        int b1 = 5;
        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println(a1 + b1);
                break;
            case '-':
                System.out.println(a1 - b1);
                break;
            case '*':
                System.out.println(a1 * b1);
                break;
            case '/':
                System.out.println(a1 / b1);
                break;
            default:
                System.out.println("Неизвестная операция");
                break;
        }
        //10
        int number = 55;

        if (number >= 10 && number <= 100) {
            System.out.println("Число входит в диапазон");
        } else {
            System.out.println("Число вне диапазона");
        }
	}
}
