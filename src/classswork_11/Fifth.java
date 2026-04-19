package classswork_11;

public class Fifth {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                if (result < 10) {
                    System.out.println(result + "   ");
                } else if (result < 100) {
                    System.out.println(result + "  ");
                } else {
                    System.out.println(result + " ");
                }
            }
            System.out.println();
        }
	  }
	}
