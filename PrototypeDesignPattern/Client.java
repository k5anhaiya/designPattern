package PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) {
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.mockLocation = 863;
        

        //Now letus suppose Object creation is a heavy process means for creating object
        //every time programme need to execute heavy commands to avoid this heavy process execution 
        //protoype design pattern came into the picture. we will not create Object 
        //rather than creating Object again and again we will follow the concept of copying the Object.

        //To copy the NetworkConnection Object simplest way is :

        //In the above example, we are updating the value of x using the reference variable obj2 and displaying the value of x using the reference variable obj1.
        // In the output, we see the updated value 6 and not the original value 30. It is because obj1 and obj2 are referring to the same memory location. 
        //Therefore, whatever update we do use the reference variable obj2, the same changes will be reflected using the reference variable obj1.

        NetworkConnection networkConnection2 = networkConnection;
        
        networkConnection2.mockLocation = 235; 
        
        System.out.println("Network MOCK LOCATION 1st Object:"+networkConnection.mockLocation);
        System.out.println("Network MOCK LOCATION 2nd Object:"+networkConnection2.mockLocation);

        

        

    }
}
