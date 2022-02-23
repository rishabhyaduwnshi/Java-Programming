
public class Main
{
	public static void main(String[] args) 
	{
	    String str1 = "Java";
	    String str2 = "Java";
	    String str3 = new String("Java");
	    
	    if(str1 == str3)
	    System.out.println("Equal");
	    else 
	    System.out.println("Not Equal"); //the reason why we get not equal is because refrences of 
	                                    //both the string are diffrent i.e, one is in pool other is in heap
	     if(str1 == str2)
	    System.out.println("Equal"); //the reason why we get equal is because refrences of 
	                                   //both the string are same i.e, both are in pool
	    else 
	    System.out.println("Not Equal");
	}
}
