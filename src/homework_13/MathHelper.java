package homework_13;

public class MathHelper {
	private MathHelper() {}
    
    public static int square(int n) {
        return n * n;
    }
    
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
