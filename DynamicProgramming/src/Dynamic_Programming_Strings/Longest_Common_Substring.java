package Dynamic_Programming_Strings;

public class Longest_Common_Substring {
    public static void main(String[] args) {
        String str1 = "abcjklp";
        String str2 = "acjkp";

        int maximum = longestCommonSubstringLenght(str1, str2);
        System.out.println("Longest Common Substring : " + maximum);


        String str=longestCommonSubstring(str1,str2);
        System.out.println("Longest Common Substring : "+str);

    }

    private static String longestCommonSubstring(String str1, String str2) {

        int[][] dp=new int[str1.length()+1][str2.length()+1];
        int max=0;
        int ind1=0;
        int ind2=0;

        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    if(dp[i][j]>=max)
                    {
                        max=dp[i][j];
                        ind1=i;
                        ind2=j;
                    }
                }
            }
        }
        System.out.println("ind1 : "+ind1 +" ind2 : "+ind2);
        StringBuilder str=new StringBuilder();
        while(dp[ind1][ind2]!=0)
        {
            str.append(str1.charAt(ind1-1));
            ind1--;
            ind2--;
        }
        return str.reverse().toString();

    }

    private static int longestCommonSubstringLenght(String str1,String str2){
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        int max=0;
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    if(max<=dp[i][j])
                    {
                        max=dp[i][j];
                    }
                }
            }
        }
        for(int[] ele : dp)
        {
            for(int val : ele)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
        return max;
    }
}
