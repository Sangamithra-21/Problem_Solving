package SET_3;

import java.util.Arrays;

public class Move_balls {
    public static void main(String[] args) {

        String boxes = "110";
        System.out.println(Arrays.toString(minOperations(boxes)));

    }

        public static int[] minOperations(String boxes) {
            int n = boxes.length();
            char[] box = boxes.toCharArray();
            int[] left = new int[n];
            int[] right = new int[n];

            int count=box[0]-'0';
            for(int i=1;i<n;i++)
            {
                left[i] = left[i-1]+count;
                count += box[i]-'0';
            }
            count=box[n-1]-'0';
            for(int j=n-2;j>=0;j--)
            {
                right[j] = right[j+1]+count;
                count += box[j]-'0';
            }

            int[] res = new int[n];
            for(int i=0;i<n;i++)
            {
                res[i] = left[i]+right[i];
            }
            return res;
        }
    }

