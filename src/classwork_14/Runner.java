package classwork_14;

import java.util.Iterator;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль.");
        String n = scanner.nextLine();
        for(int a = 0;a < n.length();a++) {
        System.out.println(n.split("")[a]);
        }
	}
}
