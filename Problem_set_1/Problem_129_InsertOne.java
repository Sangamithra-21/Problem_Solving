package Problem_set_1;

public class Problem_129_InsertOne {
    public static void main(String[] args) {
        String str="101101101111";
        int k=2;
        String res="";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            res=res+str.charAt(i);
            if(str.charAt(i)=='1')
            {
                count++;
                if(count==k) {
                    res = res + "0";
                    count=0;
                }
            }
            else {
                count=0;
            }

        }
        System.out.println("Result :"+res);
    }
}
