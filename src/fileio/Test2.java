package fileio;

import java.io.*;

public class Test2 {

    public static void doFileOp() {

        BufferedReader f=null;
        try {
            f = new BufferedReader(new FileReader("/Users/vijesh/markexample/answerkey.csv"));

            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());

            f.close ();
        }catch (Exception e){

        }
        finally {

            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void doFileOp1() {
        try (

        BufferedReader f=new BufferedReader(new FileReader("/Users/vijesh/markexample/answerkey.csv"));

        )
        {
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
            System.out.println(f.readLine());
        }
        catch (IOException e){

        }

    }



    public static void main(String[] args) {



    }


}
