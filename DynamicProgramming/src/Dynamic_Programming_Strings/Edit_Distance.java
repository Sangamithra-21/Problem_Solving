package Dynamic_Programming_Strings;

public class Edit_Distance {
    public static void main(String[] args) {

        String s1 = "horse";
        String s2 = "ros";

        int count = editDistance(s1,s2,s1.length()-1,s2.length()-1);
        System.out.println("Recursion : "+count);
    }

    private static int editDistance(String s1, String s2, int i, int j) {

        if(j<0) return i+1;

        if(i<0) return j+1;

        if(s1.charAt(i)==s2.charAt(j))
        {
            return editDistance(s1,s2,i-1,j-1);
        }
        else {
            return 1+Math.min(editDistance(s1,s2,i-1,j),Math.min(editDistance(s1,s2,i,j-1),editDistance(s1,s2,i-1,j-1)));
        }
    }
}
