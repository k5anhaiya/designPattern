package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{

    

    @Override
    public void checkSalary() {
        System.out.println("Android Developer Salary : 80000");
    }

    @Override
    public void checkEmployeeType() {
        System.out.println("I am a Android Developer");
    }
    
}
