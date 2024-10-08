package Problem_set_1;

public class Problem_18_PivotElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,5,3,2};
        int right=0;
        for(int ele : arr)
        {
            right+=ele;
        }
        int left=0;
        for(int i=0;i<arr.length;i++)
        {
            right=right-arr[i];
            if(right==left)
            {
                System.out.println("Center Element : "+arr[i]);
            }
            left=left+arr[i];
        }
        
    }
}
