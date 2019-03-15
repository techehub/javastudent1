package oops.objectcreation.exception3;

public class WithdrawFailureException extends  MyApplicationException {

    WithdrawFailureException (){
        super();
    }

    WithdrawFailureException (Exception e) {
        super(e);
    }

    WithdrawFailureException (String message, Exception e){
                super(message, e);

    }

}
