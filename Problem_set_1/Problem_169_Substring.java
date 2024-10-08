package Problem_set_1;

public class Problem_169_Substring {
    public static void main(String[] args) {
        String str1="test12";
        String str2="1234";
        for(int i=0;i<str1.length()-str2.length();i++)
        {
            String s=str1.substring(i,i+str2.length());
            if(s.equals(str2))
            {
                System.out.print("Index : "+i);
                return;
            }
        }
        System.out.println("Not FOund : -1");
    }
}
