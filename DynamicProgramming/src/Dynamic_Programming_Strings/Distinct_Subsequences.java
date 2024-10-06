package Dynamic_Programming_Strings;

import java.util.Arrays;

public class Distinct_Subsequences {
    public static void main(String[] args) {

        String s1 = "rabbbit";
        String s2 = "rabbit";

        int count = distinctSubsequences(s1,s2,s1.length()-1,s2.length()-1);
        System.out.println("Recursion : "+count);


        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        int val = distinctSubsequencesMemoization(s1,s2,s1.length()-1,s2.length()-1,dp);
        System.out.println("Memoization : "+val);

        int ct = distinctSubsequencesTabulation(s1,s2);
        System.out.println("Tabulation : "+ct);

    }

    private static int distinctSubsequencesTabulation(String s1, String s2) {
        int[][] dp=new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<=s1.length();i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    private static int distinctSubsequencesMemoization(String s1,String s2,int i,int j,int[][] dp) {

        if(j<0) return 1;
        if(i<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=(distinctSubsequencesMemoization(s1,s2,i-1,j-1,dp)+distinctSubsequencesMemoization(s1,s2,i-1,j,dp));
        }
        else {
            return dp[i][j]=distinctSubsequencesMemoization(s1,s2,i-1,j,dp);
        }

    }

    private static int distinctSubsequences(String s1, String s2,int i,int j) {
        if(j<0) return 1;
        if(i<0) return 0;

        if(s1.charAt(i)==s2.charAt(j))
        {
            return (distinctSubsequences(s1,s2,i-1,j-1)+distinctSubsequences(s1,s2,i-1,j));

        }
        else {
            return distinctSubsequences(s1,s2,i-1,j);
        }
    }
}
