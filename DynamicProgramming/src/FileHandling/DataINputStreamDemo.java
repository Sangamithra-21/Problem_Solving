package FileHandling;

import java.io.*;

public class DataINputStreamDemo {
    public static void main(String[] args) throws IOException {

        String src = "source.txt";
        FileInputStream fis = new FileInputStream(src);

        DataInputStream dis= new DataInputStream(fis);

        String des = "destination.txt";
        FileOutputStream fos = new FileOutputStream(des);

        PrintStream pis = new PrintStream(fos);

        String str = dis.readLine();
        while(str!=null)
        {
            pis.println(str);
            str=dis.readLine();
        }

        dis.close();
        fis.close();
        pis.close();
        fos.close();
    }
}
