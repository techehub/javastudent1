package oops.objectcreation.equalexample;

import java.util.Objects;

public class Student {
    String rollNo;
    String name;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }



    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public boolean equals(Object obj) {

       if ( this ==obj){
           return true;
       }

       if (obj == null || getClass() != obj.getClass()) return false;

       if (this.rollNo.equals(((Student)obj).rollNo)){
           return true;
       }

       return false;

    }


}
