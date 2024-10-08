package Problem_set_1;

public class Problem_71_LatinMatrix {
    public static void main(String[] args) {
        int n=3;
        int max=65+n-1;
        int start=65;
        for(int i=0;i<n;i++)
        {
            int val=start;
            for(int j=0;j<n;j++)
            {
                if(val>max)
                {
                    val=65;
                }
                System.out.print((char)(val++)+" ");
            }
            start++;
            System.out.println();
        }

    }
}
