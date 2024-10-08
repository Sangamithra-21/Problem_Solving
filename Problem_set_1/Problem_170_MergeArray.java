package Problem_set_1;

import java.util.ArrayList;
import java.util.List;

public class Problem_170_MergeArray {
    public static void main(String[] args) {
        int[] arr1={2,4,5,6,7,9,10,13};
        int[] arr2={2,3,4,5,6,7,8,9,11,15};
        List<Integer> result=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                result.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j])
            {
                result.add(arr2[j++]);

            }
            else if(arr1[i]<arr2[j])
            {
                result.add(arr1[i++]);
            }
        }
        while(i<arr1.length)
        {
            result.add(arr1[i++]);
        }
        while(j<arr2.length)
        {
            result.add(arr2[j++]);
        }
        System.out.println(result);
    }
}
