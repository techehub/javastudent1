package collection;

import java.util.List;
import java.util.Objects;

public class Student implements  Comparable<Student> {

    String name;
    String rollNo;
    int mark;


    public Student(String name, String rollNo, int mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
        //return 111111;
    }


    @Override
    public int compareTo(Student o) {

        if (this.mark == o.mark) {
            return 0;

        } else if (this.mark > o.mark) {
            return 1;
        } else {
            return -1;
        }
    }
}