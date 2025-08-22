package searchsort;

public class Binarysearch {
    public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
        while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
        return -1;
}

public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int target = 40;
    int result = binarySearch(arr, target);
    System.out.println(result == -1 ? "Not Found" : "Found at index " + result);
}
}
