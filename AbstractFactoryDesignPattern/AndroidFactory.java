package AbstractFactoryDesignPattern;

public class AndroidFactory extends EmployeeAbstarctFactory{

    @Override
    Employee createEmployee() {
        return new AndroidDeveloper();
    }
    
}
