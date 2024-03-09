package AbstractFactoryDesignPattern;

public class Factory {
    
    public Employee createObjectAsPerChoice(EmployeeAbstarctFactory employeeAbstarctFactory){
        return employeeAbstarctFactory.createEmployee();
    }
}
