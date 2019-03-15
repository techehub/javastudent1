package oops.objectcreation.exception2;

public class Test2 {

    public static void main(String[] args){

        try{
            AccountProcessor p= new AccountProcessor();
            p.withdraw("23123",15000);
        }

        catch (AccountNotExistsException  e){
            System.out.println("Sorry . some exeception occured !!!");
            e.printStackTrace();
        }

        catch (InsufficientFundException e){
            e.printStackTrace();
        }

        catch (MyApplicationException e){
            e.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

}
