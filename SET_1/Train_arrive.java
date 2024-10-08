package SET_1;

public class Train_arrive {
    public static void main(String[] args) {

        int[] dist = {1,3,2};
        double hour = 6;
        int val = minSpeedOnTime(dist,hour);
        System.out.println(val);
    }
        public static int minSpeedOnTime(int[] dist, double hour) {
            int low = 1;
            int high = (int)Math.pow(10,7);
            int ans=-1;
            while(low<=high)
            {
                int mid = (low+high)/2;
                if(isValid(mid,dist,hour))
                {
                    ans=mid;
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            return ans;
        }
        public static boolean isValid(int mid, int[] dist, double hour)
        {
            double val = 0;
            for(int i=0;i<dist.length-1;i++)
            {
                val = val+Math.ceil((double)dist[i]/mid);
            }
            val = val+((double)dist[dist.length-1]/mid);

            return val<=hour;
        }
    }

