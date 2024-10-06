package FileHandling;

import java.io.*;

public class ByteToInputstream {
    public static void main(String[] args) throws IOException {

        byte[] arr = "Zoho corporation".getBytes();

        ByteArrayInputStream bis = new ByteArrayInputStream(arr);

        FileOutputStream file = new FileOutputStream( "destination.txt");

        int value = bis.read();
        while(value!=-1)
        {
            file.write(value);
            value = bis.read();
        }
        System.out.println("Byte to File copied...!");
        bis.close();
        file.close();
    }
}
