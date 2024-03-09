package FactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public void getSalary() {
        System.out.println("Web Develoepr salary is Rs 5000");
    }

    @Override
    public void getEmployee() {
        System.out.println("I am a Web Developer.");
    }
    
}
