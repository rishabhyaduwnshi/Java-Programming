import java.lang.*;
import java.util.*;


abstract class featurePhone
{
    abstract public void voiceCall();
    abstract public void sendSms();
}

interface Camera
{
    void clickPhoto();
    void recordVideo();
}

interface musicPlayer
{
    void playMusic();
    void stopMusic();
}


class smartPhone extends featurePhone implements Camera,musicPlayer
{
    
    //Overriding phone's methods
    public void voiceCall()
    {
        System.out.println("Voice Call");
    }
    public void sendSms()
    {
        System.out.println("SMS sent");
    }
    public void videoCall()
    {
        System.out.println("Video Call");
    }
    
    //Overriding Camera's methods
    public void clickPhoto()
    {
        System.out.println("Photo Clicked");
    }
    public void recordVideo()
    {
        System.out.println("Video Recorder");
    }
    
    //Overriding musicPlayer's methods
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
    public void stopMusic()
    {
        System.out.println("Music Stopped");
    }
}



class Main
{
    public static void main (String[] args) 
    {
        //only featurePhone's methods can be called on f1
        featurePhone f1 = new smartPhone();
        
        //only musicPlayer's methods can be called on m1
        musicPlayer m1 = new smartPhone();
        
        //only Camera's methods can be called
        Camera c1 = new smartPhone();
        
        //all the functions can be called here
        smartPhone s1 = new smartPhone();
        
    }
    
}
