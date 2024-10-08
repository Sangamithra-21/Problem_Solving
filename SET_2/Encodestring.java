package SET_2;
public class Encodestring {
    public static void main(String[] args) {
        String str = "aabcaabcd";

       int n = str.length();
       if(n<5)
       {
           System.out.println(str);
           return;
       }

       String[][] dp = new String[n][n];

       for(int len=1;len<=n;len++)
       {
           for(int start=0;start+len<n;start++)
           {
               int end = start+len-1;

               String s = str.substring(start,end+1);
               if(s.length()<5)
               {
                   dp[start][end]=s;
                   continue;
               }
               dp[start][end]=s;
               String repeat = (s+s).substring(1,s.length()*2-1);
               int pos = repeat.indexOf(s);
               if(pos!=-1)
               {
                   String encode = (repeat.length()/pos) + "[" + dp[start][start+pos] +"]";
                    if(encode.length()<dp[start][end].length())
                    {
                        dp[start][end]=encode;
                    }

               }

               for(int i=start;i<end;i++)
               {
                   String left = dp[start][i];
                   String right = dp[i+1][end];
                   if(left.length()+right.length()<dp[start][end].length())
                   {
                       dp[start][end]=left+right;
                   }
               }
           }
       }
    }
}
