package oops.objectcreation.exception3;

public class MyApplicationException extends Exception {

    MyApplicationException(){

    }

    MyApplicationException (Exception e){
        super(e);
    }

    MyApplicationException (String m,Exception e){
        super(m,e);
    }

}
