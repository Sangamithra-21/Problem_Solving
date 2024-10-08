package Problem_set_1;

public class Problem_55_ZIG_ZAG {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12},{13,14,15,16}};
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m + n; i++) {
            if(i%2==0) {
                int row = i;
                if (i > m - 1) {
                    row = m - 1;
                }
                for (int j = row; j >= 0; j--) {
                    for (int k = 0; k < n; k++) {
                        if (j + k == i) {
                            System.out.print(arr[j][k] + " ");
                        }
                    }
                }


            }
            else {
                int col=i;
                if(i>n-1)
                {
                    col=n-1;
                }
                for(int j=0;j<m;j++)
                {
                    for(int k=col;k>=0;k--)
                    {
                        if(k+j==i)
                        {
                            System.out.print(arr[j][k]+" ");
                        }
                    }
                }

            }
            }

        }
    }



