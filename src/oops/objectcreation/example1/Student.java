package oops.objectcreation.example1;

/**
 *
 *Object Creation example
 *
 */
public class Student {

    String rollno; //Instance Variable
    String name;
    int mark1;
    int mark2;
    int mark3;

    //Instance method
    void display(){
        System.out.println("Name :"+ name);
        System.out.println("RollNo :"+ rollno);
        System.out.println("Mark1 :" + mark1);
        System.out.println("Mark2 :"+ mark2);
        System.out.println("Mark3 :"+ mark3);
        System.out.println("Total :"+ totalmark());
        System.out.println("Average :" + average(mark1,mark2,mark3));

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


    public static void main(String[] args) {

        Student s1= new Student();
        s1.display();
        s1.name= "Anoop";
        s1.rollno="1111";
        s1.mark1=22;
        s1.mark2=33;
        s1.mark3=44;

        s1.display();// Instance method work/invoke on a particular instance


    }

}
