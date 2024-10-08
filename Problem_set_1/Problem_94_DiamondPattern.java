package Problem_set_1;

public class Problem_94_DiamondPattern {
    public static void main(String[] args) {
        int n=3;
        int val=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<val;k++)
            {
                System.out.print("*");
            }
            val=val+2;
            System.out.println();
        }

        val=val-4;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<val;k++)
            {
                System.out.print("*");
            }
            val=val-2;
            System.out.println();

        }
    }
}
