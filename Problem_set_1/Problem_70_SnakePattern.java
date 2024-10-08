package Problem_set_1;

public class Problem_70_SnakePattern {
    public static void main(String[] args) {
        int val=1;
        int n=4;
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=val++;
                }
            }
            else {
                for(int j=n-1;j>=0;j--)
                {
                   arr[i][j]=val++;
                }
            }
        }

        for(int[] a : arr)
        {
            for(int ele : a)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
