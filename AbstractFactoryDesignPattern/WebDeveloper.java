package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public void checkSalary() {
        System.out.println("Web Developer Salary : 5000");
    }

    @Override
    public void checkEmployeeType() {
        System.out.println("I am a Web Developer");
    }
    
}
