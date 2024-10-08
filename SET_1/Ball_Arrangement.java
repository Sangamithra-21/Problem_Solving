package SET_1;

import java.util.ArrayList;
import java.util.List;

public class Ball_Arrangement {
    public static void main(String[] args) {

        int red = 2;
        int blue = 3;
        int green = 1;

        List<String> list =new ArrayList<>();
        findPermutution(red,blue,green,"","",list);
        System.out.println("Number of Arrangements : "+list.size());
        for(String l : list)
        {
            System.out.println(l);
        }
    }

    private static void findPermutution(int red, int blue, int green, String prev, String s, List<String> list) {

        if(red==0 && blue==0 && green==0)
        {
            list.add(s);
            return;
        }

        if(red>0 && !"R".equals(prev))
        {
            findPermutution(red-1,blue,green,"R",s+"R",list);
        }

        if(blue>0 && !"B".equals(prev))
        {
            findPermutution(red,blue-1,green,"B",s+"B",list);
        }

        if(green>0 && !"G".equals(prev))
        {
            findPermutution(red,blue,green-1,"G",s+"G",list);
        }
    }
}
