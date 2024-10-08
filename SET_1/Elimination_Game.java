package SET_1;

public class Elimination_Game {
    public static void main(String[] args) {

        int n = 9;
        int res = lastRemaining(n);
        System.out.println(res);
    }
    public static int lastRemaining(int n) {
        return leftToRight(n);
    }
    public static int leftToRight(int n)
    {
        if(n==1) return 1;
        return 2*rightToLeft(n/2);
    }
    public static int rightToLeft(int n)
    {
        if(n==1) return 1;
        if(n%2==1) return 2*leftToRight(n/2);
        return 2*leftToRight(n/2)-1;
    }
}
