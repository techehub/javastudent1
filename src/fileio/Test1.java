package fileio;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedInputStream f = new BufferedInputStream (new FileInputStream(new File("/Users/vijesh/markexample/answerkey.csv")),1024);


        byte[] buf = new byte[100];
        f.read(buf, 0,10);


        for (int x : buf){
            System.out.println((char)x);
        }

        /*
        int i ;
        while ( (i= f.read ()) != -1){
            System.out.println((char)i);
        }

        System.out.println("----------");

        System.out.println( i);
*/

    }

}
