package Problem_set_1;

public class Problem_10_RectangleSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,6},{5,3,8,1,2},{4,6,7,5,5},{2,4,8,9,4}};
        int x1=2;
        int y1=0;
        int x2=3;
        int y2=4;
        int sum=0;
        for(int i=x1;i<=x2;i++)
        {
            for(int j=y1;j<=y2;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum :"+sum);
    }
}
