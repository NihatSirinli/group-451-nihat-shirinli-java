package classwork_22;
import java.util.Scanner;
public class Runner {
	//1
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		    System.out.println("Ismayil go school");
		}
		
		//2
        int[] fruits = {1, 0, 0, 1, 1, 0};
        int count = 0;

        for (int i = 0; i < fruits.length; i = i + 1) {
            if (fruits[i] == 1) {
                System.out.println(1);
                count = count + 1;
            }
        }

        System.out.println("Количество: " + count);
        //3
        int n = 10;
        while (n <= 10) {
           System.out.println(n);
            n++;
        }      
        //4
        Scanner in = new Scanner(System.in);
        int pass;

        do {
            System.out.println("Введите пароль:");
            pass = in.nextInt();
        } while (pass != 123);

        System.out.println("Добро пожаловать!");
    }
}