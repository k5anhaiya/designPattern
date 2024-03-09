package SingeltonDesignPattern;

public class Samosa {
    private static Samosa samosa;
    
    private Samosa(){

    }


    //LAZY Instatitation METHOD

    public static Samosa getInstance(){
        if(samosa==null){
            samosa = new Samosa();    
        }
        return samosa;
    }
}
