package AbstractFactoryDesignPattern;

public class WebFactory extends EmployeeAbstarctFactory{

    

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
    
}
