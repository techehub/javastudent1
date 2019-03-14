package oops.objectcreation.example4;

/**
 * Constructor Overloading example
 *
 * we can invoke one constructor form another using-  this ()
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

    //Constructor function
    //Name should be same as class name
    //No return type
    public Student(String rollno, String name, int mark1, int mark2, int mark3) {
        this (rollno,name); // calling other constructor function. should be the first statement
        this.mark1 = mark1; // 'this' keyworkd is used to point to current object
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    public Student(String rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

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


}
