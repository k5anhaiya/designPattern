package AbstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        
        Factory factory=new Factory();

        Employee Android = factory.createObjectAsPerChoice(new AndroidFactory());

        Employee web = factory.createObjectAsPerChoice(new WebFactory());

        Android.checkEmployeeType();
        Android.checkSalary();
        web.checkEmployeeType();
        web.checkSalary();
    }
}
