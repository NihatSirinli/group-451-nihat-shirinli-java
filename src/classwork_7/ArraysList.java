package classwork_7;

public class ArraysList {
	public static int findMax(int[] arr) {

	if (arr == null || arr.length == 0) throw new
	IllegalArgumentException();

	int max = arr[0];

	for (int num : arr) {

	if (num > max) max = num;

	}

	return max;

	}
}
