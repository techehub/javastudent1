package oops.objectcreation.example3;

/**
 * Object Construction example
 *
 * If we did not provide a constructor function in class , a default constructor will be created once the code get complied
 *
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

    //Constructor function
    //Name should same as class name
    //No return type

    public Student(String rollno, String name, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
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
