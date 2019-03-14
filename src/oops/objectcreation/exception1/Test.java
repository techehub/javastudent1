package oops.objectcreation.exception1;

import java.io.FileNotFoundException;
import java.nio.channels.FileLock;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Test {


    static int getvalue(int index ){

        int a[] = {1,2,4,5,6};

        return a[index];

    }

    static void getdata(int index ) throws SQLException{

           throw  new SQLException();

    }


    static int div (int a, int b ){

      return a/b;

    }



    public static void test() throws SQLException {

            try {
                getdata(3);
            }
            catch (SQLException e){
                System.out.println("SQL happened while getting the data");
                throw e ;
            }
    }


    public static void main(String[] args) throws SQLException{


        test();

        try {
            int  x= getvalue(2);
            int  y= div(10,1);
            System.out.println("valaue is :"+ x);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Incorrect index provided !!!");
        }
        catch (ArithmeticException e){
            System.out.println( "ArithmeticException occured");
        }
        finally {
            System.out.println("Finally");
        }

    }
}
