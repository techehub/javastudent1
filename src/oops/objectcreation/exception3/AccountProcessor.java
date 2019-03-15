package oops.objectcreation.exception3;

public class AccountProcessor {

    static Account accounts [] = {
            new Account("111", "Kumar", 12000),
            new Account("222", "Anoop", 10000),
            new Account("333", "John", 15000),
    };

    void withdraw( String accountNumber, double amount) throws WithdrawFailureException{

       try {

           Account acc = getAccount(accountNumber);
           if ( amount <acc.balance  ){
               acc.balance = acc.balance- amount;
           }
           else {
               throw new InsufficientFundException();
           }

       } catch (AccountNotExistsException | InsufficientFundException e){
           System.out.println("AccountNotExistsException occured !!!");

            String message = "Exception occured while withdrwaing "+ amount + "amout from " + accountNumber +"acount";
            throw new WithdrawFailureException(message,e);

       }






    }

    Account getAccount (String accountNumber) throws AccountNotExistsException {
        for (Account account : accounts) {
            if (account.accNo.equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotExistsException();

    }




}
