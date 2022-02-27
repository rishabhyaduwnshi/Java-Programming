import java.lang.*;
import java.util.*;

class basicCar
{
    public void startCar()
    {
        System.out.println("basicCar started");
    }
    
    public void changeGear()
    {
    System.out.println("Gear Changed for basicCar");    
    }
}

class smartCar extends basicCar
{
    @Override
    public void startCar() //function overriding
    {
        System.out.println("smartCar started");
    }
    
    @Override
    public void changeGear() //function overriding
    {
        System.out.println("Automatic Gear");
    }
    
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
    
}

//if function defined in parent is redefined is child class, it is called as function overriding

class Main
{
    public static void main(String args[])
    {
        basicCar b1 = new basicCar();
        b1.startCar();
        b1.changeGear();
        System.out.println("");
        
        smartCar c1 = new smartCar();
        c1.startCar();
        c1.changeGear();
        c1.playMusic();
    }
}
