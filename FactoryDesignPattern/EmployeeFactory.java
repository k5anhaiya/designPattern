package FactoryDesignPattern;

public class EmployeeFactory {
    public Employee createObjectOfEmployee(String employeeType){
        if(employeeType.equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(employeeType.equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        return null;
    }
    
}
