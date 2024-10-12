package SET_4;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,4,2,1,3};
        int n = arr.length;

        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
