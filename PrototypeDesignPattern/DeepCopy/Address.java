package PrototypeDesignPattern.DeepCopy;

public class Address implements Cloneable{
    int addressId;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
