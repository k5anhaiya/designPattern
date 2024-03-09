package SingeltonDesignPattern;

public class Client {
    public static void main(String[] args) {

        //TESTING SAMOSA 
        Samosa samosa = Samosa.getInstance();
        System.out.println(samosa.hashCode());
        Samosa samosa1= Samosa.getInstance();
        System.out.println(samosa1.hashCode());


        //TESTING LENOVO

        Lenovo lenovo =  Lenovo.getInstance();
        System.out.println(lenovo.hashCode());
        Lenovo lenovo2 = Lenovo.getInstance();
        System.out.println(lenovo2.hashCode());

        //creating synchronised Lenovo Class using Synchronised block
    }
}
