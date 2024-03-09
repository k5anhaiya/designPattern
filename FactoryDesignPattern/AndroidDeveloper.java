package FactoryDesignPattern;

public class AndroidDeveloper implements Employee {

    @Override
    public void getSalary() {
        System.out.println("Android Developer salary is Rs.15000");
        
    }

    @Override
    public void getEmployee() {
        System.out.println("I am Android Developer.");
        
    }
    
    
}
