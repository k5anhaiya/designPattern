package SingeltonDesignPattern;

public class Lenovo {

    //Early Instantiation
    
    private static Lenovo lenovo; 

    private Lenovo(){

    }


    //creating synchronised Lenovo Class using Synchronised block
    public static Lenovo getInstance(){

    if(lenovo==null)
    {
        synchronized(Lenovo.class)
        {
            if(lenovo==null)
            {
                lenovo = new Lenovo();
            }
        }
    }
        
        return lenovo;
    }


}
