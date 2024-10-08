package SET_2;

public class Train_arrive {
    public static void main(String[] args) {

        double[] arr= {9.00,9.40,9.50,11.00,15.00,18.00};
        double[] dep = {9.10,12.00,11.20,11.30,19.00,20.00};

        int res = 1;
        int plat;
        for(int i=0;i<arr.length;i++)
        {
            plat=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]>=arr[j] && arr[i]<=dep[j])
                    {
                        plat++;
                    }
                }
                res = Math.max(res,plat);
            }
        }
        System.out.println(res);
    }
}
