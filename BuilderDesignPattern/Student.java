package BuilderDesignPattern;

import BuilderDesignPattern.User.UserBuilder;

public class Student {
    private final String name;
    private final String city;
    private final Integer rollNumber;
    private final Integer age;

    public Student(StudentBuiler studentBuilder){
        this.name=studentBuilder.name;
        this.city=studentBuilder.city;
        this.rollNumber=studentBuilder.rollNumber;
        this.age=studentBuilder.age;


    }

    

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public Integer getAge() {
        return age;
    }


    static class StudentBuiler{
        private String name;
        private String city;
        private Integer rollNumber;
        private Integer age;
       
       
        public StudentBuiler(String name, String city, Integer rollNumber, Integer age) {
            this.name = name;
            this.city = city;
            this.rollNumber = rollNumber;
            this.age = age;
        }

        public Student build(){
            Student student=new Student(this);
            return student;
        }


        public StudentBuiler setName(String name) {
            this.name = name;
            return this;
        }


        public StudentBuiler setCity(String city) {
            this.city = city;
            return this;
        }


        public StudentBuiler setRollNumber(Integer rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }


        public StudentBuiler setAge(Integer age) {
            this.age = age;
            return this;
        }

        @Override
        public String toString() {
            return "StudentBuiler [name=" + name + ", city=" + city + ", rollNumber=" + rollNumber + ", age=" + age
                    + "]";
        }

        

        

        
    }
}
