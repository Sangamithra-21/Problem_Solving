package SET_4;

import java.util.HashMap;
import java.util.Map;

public class target_sum_count {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1};

        int target = 2;
        int count=0;
        /*
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    count++;
                }
            }
        }
        System.out.println(count);

         */

       Map<Integer,Integer> map = new HashMap<>();
       for(int ele : arr)
       {
           int val = target-ele;
           if(map.containsKey(val))
           {
               count += map.get(val);
           }
           map.put(ele,map.getOrDefault(ele,0)+1);
       }
        System.out.println(count);
    }
}

