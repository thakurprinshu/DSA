package SearchSort;

public class Selectionsort {
    public static void selsort(int[] arr){
        int n= arr.length;
        for(int i =0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums={55,25,2,45,60,22};
        selsort(nums);
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
}
