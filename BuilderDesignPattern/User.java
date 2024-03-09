package BuilderDesignPattern;

public class User {
    private final String name;
    private final String city;
    private final Integer rollNumber;
    private final Integer age;

    private User(UserBuilder userBuilder){
        this.name=userBuilder.name;
        this.city=userBuilder.city;
        this.rollNumber=userBuilder.rollNumber;
        this.age=userBuilder.age;
    
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


    static class UserBuilder{
        private String name;
        private String city;
        private Integer rollNumber;
        private Integer age;

        public User build(){
            User user=new User(this);
            return user;
        }

        
        public UserBuilder(String name, String city, Integer rollNumber, Integer age) {
            this.name = name;
            this.city = city;
            this.rollNumber = rollNumber;
            this.age = age;
        }



        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setRollNumber(Integer rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }


        @Override
        public String toString() {
            return "UserBuilder [name=" + name + ", city=" + city + ", rollNumber=" + rollNumber + ", age=" + age + "]";
        }

        

        
    }
    
}
