package Problem_set_1;

public class Problem_146_Multiplication {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        int result=0;
        for(int i=0;i<min;i++)
        {
            result=result+max;
        }
        System.out.println("Result : "+result);
    }
}
