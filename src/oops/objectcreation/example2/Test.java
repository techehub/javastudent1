package oops.objectcreation.example2;

public class Test {

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

        int avg = average(s1.mark1, s1.mark2, s1.mark3); // static method can be invoked on without creating
        int avg1 = average(22,33,44); //static method can be invoked on without creating
        int avg3 = average(22,33,44,55); //static method can be invoked on without creating
    }
    
}
