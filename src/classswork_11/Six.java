package classswork_11;

public class Six {
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        int count = 0;

        while (count < n) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;

            count++;
        }
    }
  }
