package SET_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class next_greater {
    public static void main(String[] args) {

        int[] arr = {6,3,9,10,8,2,1,15,7};
        int max = 0;
        Set<Integer> set = new HashSet<>();

        for(int ele : arr)
        {
            set.add(ele);
            max= Math.max(ele,max);
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = getNextElement(set,arr[i],max);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static int getNextElement(Set<Integer> set, int arr, int max)
    {
        for(int a=arr+1;a<=max;a++)
        {
            if(set.contains(a))
            {
                return a;
            }
        }
        return -1;
    }
}
