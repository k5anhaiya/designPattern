package BuilderDesignPattern;

import BuilderDesignPattern.User.UserBuilder;

public class Client {
    public static void main(String[] args) {
        User.UserBuilder user= new User.UserBuilder(null, null, null, null);

        user.setName("Kanhiaya Kumar").setCity("New Delhi").setAge(26).setRollNumber(4563).build();

        System.out.println(user);


        User.UserBuilder user1=new User.UserBuilder(null, null, null, null);
        user1.setName("Rahul Kumar").setRollNumber(123135).setAge(46);

        System.out.println(user1);


        //TESTING STUDENT 

        Student.StudentBuiler student=new Student.StudentBuiler(null, null, null, null);
        student.setName("Anil Kumar").setCity("Ghaziabad").setAge(26).setRollNumber(123456);
        System.out.println(student);


        Student.StudentBuiler student1=new Student.StudentBuiler(null, null, null, null);
        student1.setName("Test").setCity("Test").build();

        System.out.println(student1);
    }
}
