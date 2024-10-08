package Problem_set_1;

public class Problem_5_MatrixAddition {
    public static void main(String[] args) {
        int[] a={3,5,4,2};
        int[] b={2,4,5};
        int[] c={4,5,6,7,8};
        int[] d={4,9,2,1};
        int i=a.length-1;
        int j=b.length-1;
        int k=c.length-1;
        int l=d.length-1;
        int sum=0;
        int carry=0;
        int result=0;
        int fact=1;
        while(i>=0 || j>=0 || k>=0 || l>=0)
        {
            int a1= i>=0 ? a[i] : 0;
            i--;
            int a2= j>=0 ? b[j] : 0;
            j--;
            int a3= k>=0 ? c[k] : 0;
            k--;
            int a4= l>=0 ? d[l] : 0;
            l--;
            sum=a1+a2+a3+a4+carry;
            result=result+(sum%10*fact);
            carry=sum/10;
            fact=fact*10;

        }
        System.out.println("Result : "+result);
    }
}
