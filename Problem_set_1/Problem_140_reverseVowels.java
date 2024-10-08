package Problem_set_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_140_reverseVowels {
    public static void main(String[] args) {
        String str="abcdef";
        int i=0;
        int j=str.length()-1;
        char[] arr=str.toCharArray();
        List<Character> s=new ArrayList<>(Arrays.asList('a','e','u','i','o','u','A','E','I','O','U'));
        while(i<j)
        {
            if(s.contains(arr[i]) && s.contains(arr[j]))
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(s.contains(arr[i])) {
                j--;
            }
            else if(s.contains(arr[j])) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        System.out.println(String.valueOf(arr));

    }
}
