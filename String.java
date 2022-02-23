
public class Main
{
	public static void main(String[] args) 
	{
	    char c[] = {'A','B','C'}; //Method 1
	    String str = new String(c);
	    System.out.println(str);
	    
	    byte b[] = {65,66,67}; //Method 2
	    String str1 = new String(b);
	    System.out.println(str1);
	    
	    String str2 = "JAVA"; //Method 3
	    System.out.println(str2);
	}
}
