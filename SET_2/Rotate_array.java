package SET_2;

import java.util.Arrays;

public class Rotate_array {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int k = 2;
        rotateArray(0,arr.length-1,arr);
        rotateArray(0,k-1,arr);
        rotateArray(k,arr.length-1,arr);
        System.out.println("Array : "+ Arrays.toString(arr));
    }

    private static void rotateArray(int i, int j, int[] arr) {

        while(i<j)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j--] = temp;
            i++;
        }
    }
}
