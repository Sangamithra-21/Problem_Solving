package SET_4;

import java.util.ArrayList;
import java.util.List;

public class Union_of_arrays {
    public static void main(String[] args) {

        int[] a = {85,25,1,32,54,6};
        int[] b = {85,2};
        /*
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            list.add(a[i]);
        }
        for(int j=0;j<b.length;j++)
        {
            if(!list.contains(b[j]))
            {
                list.add(b[j]);
            }
        }
        System.out.println(list.size());

         */

        int i=0;
        int j=0;
        int count = 0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
            {
                i++;j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                j++;
            }
            count++;
        }
        while(i<a.length)
        {
            count++;
            i++;
        }
        while(j<b.length)
        {
            count++;
            j++;
        }
        System.out.println("count : "+count);
    }
}
