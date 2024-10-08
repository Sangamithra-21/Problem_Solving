package Problem_set_1;

import java.util.Arrays;

public class Problem_51_ReplaceGreater {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int max=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int j=arr.length-2;j>=0;j--)
        {
            int val=arr[j];
            arr[j]=max;
            if(val>max)
            {
                max=val;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
