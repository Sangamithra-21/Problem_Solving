package SET_1;

public class Max_Ball {
    public static void main(String[] args) {

        int low = 19;
        int high = 99;
        int size = findDigits(high);
        int[] arr = new int[10+size];
        int max = 0;
        for(int i=low;i<=high;i++)
        {
            if(i<9)
            {
                arr[i]++;
                continue;
            }
            int pos = findDigits(i);
            arr[pos]++;
            max = Math.max(arr[pos],max);
        }
        System.out.println("Max : "+max);

    }
    public static int findDigits(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
}
