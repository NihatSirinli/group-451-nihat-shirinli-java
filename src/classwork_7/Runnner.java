package classwork_7;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
public class Runnner {
	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int sum = a+b;
//		
//		int c = 4;
//		if(c % 2 == 0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
//		
//		
//		
//		for(int i = 0;i <= 10; i++) {
//			System.out.println(i);
//		}
		
		int hj = 10;
		int jj = 0;
		
		if(jj != 0) {
			System.out.println(hj / jj);
		}else {
			System.out.println(0);
		}
		

		

		List<String> words = Arrays.asList("кошка", "кот", "тигр",
		"ягуар");

		List<String> longWords = words.stream()

		.filter(w -> w.length() > 4)

		.collect(Collectors.toList());

		System.out.println(longWords); // [кошка, ягуар]
	}
}
