package PrototypeDesignPattern.DeepCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student=new Student();
        student.rollNumber = 863;
        
        Address address=new Address();
        address.addressId=22;
        student.address=address;


        Student student2=(Student)student.clone();
        
        student2.rollNumber = 235; 
        student2.address.addressId=39; 
        
        System.out.println("student 1 MOCK LOCATION 1st Object:"+student.rollNumber);
        System.out.println("student 2 MOCK LOCATION 2nd Object:"+student2.rollNumber);

        System.out.println("1st address :"+student.address.addressId);
        System.out.println("2nd address :"+student2.address.addressId);

        

        

    }
}
