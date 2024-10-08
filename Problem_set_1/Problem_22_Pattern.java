package Problem_set_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem_22_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i < n; i++) {
            List<Integer> prev = list.get(list.size() - 1);
            List<Integer> res = new ArrayList<>();
            int count = 0;
            int ele = prev.get(0);
            for (int j = 0; j < prev.size(); j++) {

                if (ele == prev.get(j)) {
                    count++;

                } else {
                    res.add(count);
                    res.add(ele);
                    ele = prev.get(j);
                    count = 1;
                }
            }
            res.add(count);
            res.add(ele);
            list.add(res);


        }
        for(List<Integer> a : list)
        {
            for(int ele : a)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

}
