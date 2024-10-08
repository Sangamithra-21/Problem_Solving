package SET_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_string_chain {
    public static void main(String[] args) {

        String[] words = {"a","b","ba","bca","bda","bdca"};
        System.out.println(longestStrChain(words));

    }
    public static   int longestStrChain(String[] words) {
        int res = 0;
        Arrays.sort(words , (a, b)->(a.length()-b.length()));
        Map<String,Integer> map = new HashMap<>();

        for(String word : words)
        {
            map.put(word,1);
            for(int i=0;i<word.length();i++)
            {
                StringBuilder str = new StringBuilder(word);
                String newWord = str.deleteCharAt(i).toString();
                if(map.containsKey(newWord))
                {
                    map.put(word,Math.max(map.get(word),map.get(newWord)+1));
                }
            }
            res = Math.max(res,map.get(word));
        }
        return res;
    }
}
