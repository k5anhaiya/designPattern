package PrototypeDesignPattern.shallowCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student=new Student();
        student.rollNumber = 863;
        

        //Now letus suppose Object creation is a heavy process means for creating object
        //every time programme need to execute heavy commands to avoid this heavy process execution 
        //protoype design pattern came into the picture. we will not create Object 
        //rather than creating Object again and again we will follow the concept of copying the Object.

        //To copy the NetworkConnection Object simplest way is :

        //In the above example, we are updating the value of x using the reference variable obj2 and displaying the value of x using the reference variable obj1.
        // In the output, we see the updated value 6 and not the original value 30. It is because obj1 and obj2 are referring to the same memory location. 
        //Therefore, whatever update we do use the reference variable obj2, the same changes will be reflected using the reference variable obj1.

        Student student2=(Student)student.clone();
        
        student2.rollNumber = 235; 
        
        System.out.println("student 1 MOCK LOCATION 1st Object:"+student.rollNumber);
        System.out.println("student 2 MOCK LOCATION 2nd Object:"+student2.rollNumber);

        

        

    }
}
