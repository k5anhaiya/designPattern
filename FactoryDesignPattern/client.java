package FactoryDesignPattern;

public class client {
    
    public static void main(String[] args) {
        EmployeeFactory employeeFactory=new EmployeeFactory();

        Employee Android= employeeFactory.createObjectOfEmployee("Android Developer");

        Employee web = employeeFactory.createObjectOfEmployee("Web Developer");

        Android.getEmployee();;
        Android.getSalary();
        web.getEmployee();;
        web.getSalary();

        
    }
}
