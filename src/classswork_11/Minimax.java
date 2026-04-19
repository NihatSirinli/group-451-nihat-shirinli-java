package classswork_11;

public class Minimax {
    static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int[] result = findMinMax(arr);

        System.out.println("Min = " + result[0]);
        System.out.println("Max = " + result[1]);
    }
}