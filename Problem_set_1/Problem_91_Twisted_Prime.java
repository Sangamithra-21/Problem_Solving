package Problem_set_1;

public class Problem_91_Twisted_Prime {
    public static void main(String[] args) {
        int input=97;
        int val=input;
        int twistedNumber=0;
        while(val>0)
        {
            int rem=val%10;
            twistedNumber=twistedNumber*10+rem;
            val=val/10;
        }
        if(checkPrime(input) && checkPrime(twistedNumber))
        {
            System.out.println("Twisted Prime NUmber");
            return;
        }
        System.out.println("Not Twisted Prime");

    }
    private static boolean checkPrime(int num)
    {
        int count=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                if(count==2)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
