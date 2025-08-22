package SearchSort;

public class Insertionsort {
    public static void insertsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] nums={2,45,3,10,20,5,4,60};
        insertsort(nums);
        for(int a:nums){
            System.out.print(a+" ");
        }

    }
}
