package classswork_11;

public class Third {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = sumArray(arr);

        System.out.println("Sum of array elements: " + result);
	}

	private static int sumArray(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    static int sumArray1(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
