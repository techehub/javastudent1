package oops.objectcreation.example5;


/**
 *
 * Student Inherits Person
 *
 */
public class Student extends  Person {

    String rollno; //Instance Variable
    int mark1;
    int mark2;
    int mark3;

    static final int  PASS_SCORE=100; //Class Variable
    static final  String PASS= "PASS";
    static final  String FAIL= "FAIL";

    //Instance method
    void display(){

        super.display();
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

}
