package PrototypeDesignPattern.shallowCopy;

public class Student implements Cloneable {
    int rollNumber;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
