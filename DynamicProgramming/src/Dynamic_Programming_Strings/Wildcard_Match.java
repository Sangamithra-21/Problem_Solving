package Dynamic_Programming_Strings;

public class Wildcard_Match {
    public static void main(String[] args) {

        String s1="aab";
        String s2="c*a*b";

        boolean match = wildcardMatching(s1,s2,s1.length()-1,s2.length()-1);
        System.out.println("Recursion : "+match);
    }

    private static boolean wildcardMatching(String s1, String s2, int i, int j) {

        if(i<0 && j<0) return true;

        if(i<0 && j>=0)
        {
            while(j>=0)
            {
                if(s2.charAt(j)!='*')
                {
                    return false;
                }
                j--;
            }
            return true;
        }

        if(j<0 && i>=0) return false;

        if(s1.charAt(i)==s2.charAt(j) || s2.charAt(j)=='?')
        {
            return wildcardMatching(s1,s2,i-1,j-1);
        }
        else if(s2.charAt(j)=='*') {
            return wildcardMatching(s1, s2, i - 1, j) || wildcardMatching(s1, s2, i, j - 1);
        }
        return false;
    }
}
