package SET_1;

public class Longest_substring {
    public static void main(String[] args) {

        String s = "pwwkew";
        int val = lengthOfLongestSubstring(s);
        System.out.println(val);
    }
    public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int ans = 0;
        int[] arr = new int[127];

        while(j<s.length())
        {
            arr[s.charAt(j)]++;
            while(arr[s.charAt(j)]>1)
            {
                arr[s.charAt(i)]--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
