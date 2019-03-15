package oops.objectcreation.exception2;

public class Test {




    public static void main(String[] args) throws AccountNotExistsException, InsufficientFundException {


        AccountProcessor p= new AccountProcessor();
        p.withdraw("23123",15000);

    }

}
