package SET_4;

import java.util.Arrays;

public class chocolate_distribution {
    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        int i=0;
        int j=i+m-1;

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        while(j<arr.length)
        {
            int diff = arr[j]-arr[i];
            min = Math.min(diff,min);
            i++;
            j++;
        }
        System.out.println("Minimum : "+min);
    }
}
