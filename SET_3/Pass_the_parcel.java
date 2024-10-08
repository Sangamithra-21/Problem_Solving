package SET_3;

import java.util.ArrayList;
import java.util.List;

public class Pass_the_parcel {
    public static void main(String[] args) {

        int n = 6;
        String song = "abba";
        int len = song.length();

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }
        int i=0;
        int person = 0;

        while(list.size()>1)
        {
            i = i%len;
            person = person % list.size();
            if(song.charAt(i)=='a')
            {
                person++;
            }
            else if(song.charAt(i)=='b')
            {
                list.remove(person);
            }
            i++;
        }
        System.out.println(list.get(0));

    }
}
