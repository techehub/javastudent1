package oops.objectcreation.exception3;

public class Test {

    public static void main(String[] args){

        try{
            AccountProcessor p= new AccountProcessor();
            p.withdraw("111",15000);
        }
        catch (WithdrawFailureException e){
            //System.out.println( e.getCause());
            //e.printStackTrace();
            System.out.println(e.getMessage());

        }



    }
}
