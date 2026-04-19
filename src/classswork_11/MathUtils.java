package classswork_11;

public class MathUtils {
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
    
        static boolean IsPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(IsPrime(7));
        System.out.println(IsPrime(10));
    }
}
