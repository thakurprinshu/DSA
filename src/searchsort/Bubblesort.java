package searchsort;

public class Bubblesort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {5, 8, 9, 6, 7, 10, 1};
        sort(nums);
        for (int a:nums) {
            System.out.print(a+" ");
        }
    }
}
