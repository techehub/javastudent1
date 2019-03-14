package oops.objectcreation.example3;

/**
 * method overloading
 */
public class Test {


    public static void main(String[] args) {

        //there is no default constructor. below line won't work
        //Student s1= new Student();

        Student s1= new Student("111", "Kumar", 33,44,55);
        s1.display();

        // We can access the instance variables as below.
        String name = s1.name;


        //We can modify instance variables as below
        s1.name= "Anoop";
        s1.rollno="1111";
        s1.mark1=22;
        s1.mark2=33;
        s1.mark3=44;

        s1.display();// Instance method work/invoke on a particular instance

    }
    
}
