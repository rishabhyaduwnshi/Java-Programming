import java.lang.*;
import java.util.*;

class hondaCityCar
{
    //static member has only one copy and that is shared among all the objects created for that class
    static double basePrice = 1000000;
    
    //finalprice will be created everytime an object is created
    int finalPrice;
    
    static double onRoadPrice(String city)
    {
        switch(city)
        {
            case "delhi":
                return basePrice+basePrice*0.1;
            case "mumbai":
                return basePrice+basePrice*0.2;
            case "allahabad":
                return basePrice+basePrice*0.3;
            default:
                return basePrice;
        }
        
    }
}



class Main
{
    public static void main(String args[])
    {
        hondaCityCar h1 = new hondaCityCar();
        System.out.println("basePrice of car in Delhi is : "+h1.basePrice);
        System.out.println("Price of card in Delhi is : "+h1.onRoadPrice("delhi"));
        
        System.out.println(""); 
        
        hondaCityCar h2 = new hondaCityCar();
        System.out.println("basePrice of car in mumbai is : "+h2.basePrice);
        System.out.println("Price of car in Mumbai is : "+h2.onRoadPrice("mumbai"));
        
        System.out.println(""); 
        
        //static members can be directly called onn class
        System.out.println("basePrice of car in any city is : "+hondaCityCar.basePrice);
        
    }
}
