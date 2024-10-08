package Problem_set_1;

public class Problem_50_SortValueAndChange {
    public static void main(String[] args) {
        int[] arr={0,2,2,2,0,6,6,0,8};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
            else if(i<arr.length-1 && arr[i]==arr[i+1])
            {
                System.out.print((arr[i]+arr[i+1])+" ");
                arr[i+1]=0;
            }
            else {
                System.out.print(arr[i]+" ");
            }
        }
        for(int j=0;j<count;j++)
        {
            System.out.print(0+" ");
        }
    }
}
