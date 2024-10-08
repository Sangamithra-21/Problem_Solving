package Problem_set_1;

public class Problem_4_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int left=0;
        int right=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++) {
                if(i+j<=arr.length-1)
                {
                    left+=arr[i][j];
                }
                if(i+j>=arr.length-1)
                {
                    right+=arr[i][j];
                }
            }
        }
        int max=Math.max(left,right);
        System.out.println("Maximum Value :"+max);
    }
}
