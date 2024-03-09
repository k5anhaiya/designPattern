package PrototypeDesignPattern.DeepCopy;

public class Student implements Cloneable {
    int rollNumber;

    Address address;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = (Address) address.clone();
        return student;
    }
}
