package oops.objectcreation.example2;


/**
 * Since there is no main function in this class, we can not run this class.
 *
 * Provided another class named Test having main function
 *
 * There we have created object object of Student class
 *
 *
 */

public class Student {

    String rollno; //Instance Variable
    String name;
    int mark1;
    int mark2;
    int mark3;

    static final int  PASS_SCORE=100; //Class Variable
    static final  String PASS= "PASS";
    static final  String FAIL= "FAIL";


    //Instance method
    void display(){
        System.out.println("Name :"+ name);
        System.out.println("RollNo :"+ rollno);
        System.out.println("Mark1 :" + mark1);
        System.out.println("Mark2 :"+ mark2);
        System.out.println("Mark3 :"+ mark3);
        System.out.println("Total :"+ totalmark());
        System.out.println("Average :" + average(mark1,mark2,mark3));
        if (totalmark()>PASS_SCORE){
            System.out.println("Status :" + PASS);
        }
        else {
            System.out.println("Status :" + FAIL);
        }
    }

    //Instance method
    int totalmark(){
        return mark1+ mark2 + mark3;
    }


    static int average(int mark1, int  mark2, int mark3){
        return ( mark1 + mark2 + mark3)/3;
    }

    static int average(int mark1, int  mark2, int mark3, int mark4){
        return ( mark1 + mark2 + mark3+ mark4)/4;
    }

    
}
