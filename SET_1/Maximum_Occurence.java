package SET_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Maximum_Occurence {
    public static void main(String[] args) {

        int res = maxFreq("aababcaab",2,3,4);
        System.out.println(res);

    }
    public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        if(s==null || maxLetters==0 || maxSize==0)
        {
            return 0;
        }
        int max=0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length()-minSize+1;i++)
        {
            String str = s.substring(i,i+minSize);
            if(isValid(str,maxLetters))
            {
                map.put(str,map.getOrDefault(str,0)+1);
                max=Math.max(max,map.get(str));
            }
        }
        return max;
    }

    public static boolean isValid(String s, int max)
    {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) set.add(c);
        return set.size()<=max;
    }
}
