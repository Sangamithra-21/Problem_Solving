package Dynamic_Programming_Strings;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {

        String str1="adcbc";
        String str2="dcadb";
        int count1=longestSubsequenceRecursion(str1,str2,str1.length()-1,str2.length()-1);
        System.out.println("Longest Subsequence : (Recursion) :"+count1);

        int[][] dp=new int[str1.length()][str2.length()];
        int count2=longestSubsequenceMemoization(str1,str2,str1.length()-1,str2.length()-1,dp);
        System.out.println("Longest Subsequence : (Memoization) :"+count2);

        int count3=longestSubsequenceTabulation(str1,str2);
        System.out.println("Longest SUbsequence : (Tabulation) : "+count3);


        String val=longestSubsequenceString(str1,str2);
        System.out.println("Longest subsequence :(Tabulation) --> String : "+val);



    }

    private static String longestSubsequenceString(String str1, String str2) {
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=dp[i][j]+Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i=str1.length();
        int j=str2.length();
        StringBuilder str= new StringBuilder();
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                str.insert(0, str1.charAt(i - 1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                i--;
            }
            else {
                j--;
            }
        }
        return str.toString();
    }

    static int longestSubsequenceTabulation(String str1, String str2) {

        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=dp[i][j]+Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    private static int longestSubsequenceMemoization(String str1, String str2, int i, int j, int[][] dp) {

        if(i<0 || j<0)
        {
            return 0;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }

        if(str1.charAt(i)==str2.charAt(j))
        {
            return dp[i][j]=1+longestSubsequenceMemoization(str1,str2,i-1,j-1,dp);
        }

       return  dp[i][j]=Math.max(longestSubsequenceMemoization(str1,str2,i-1,j,dp),longestSubsequenceMemoization(str1,str2,i,j-1,dp));


    }

    private static int longestSubsequenceRecursion(String str1, String str2, int i, int j) {
        if(i<0 || j<0)
        {
            return 0;
        }

        if(str1.charAt(i)==str2.charAt(j))
        {
            return 1+longestSubsequenceRecursion(str1,str2,i-1,j-1);
        }
        return Math.max(longestSubsequenceRecursion(str1,str2,i-1,j),longestSubsequenceRecursion(str1,str2,i,j-1));
    }
}
