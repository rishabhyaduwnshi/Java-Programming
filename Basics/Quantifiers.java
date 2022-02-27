
public class Main
{
	public static void main(String[] args) 
	{
	    String str1 = "aasdfghj";
	    System.out.println(str1.matches(".*")); //true if str has any character, any no of times
	    
	    String str2 = "AABBBBCCCCC";
	    System.out.println(str2.matches("[ABC]*")); //any string contaning only A,B or C any no of times
	    
	    String str3  = "ABCCA";
	    System.out.println(str3.matches("[ABC]{5}")); //string of length exactly 5, contaning only A,B or C
	}
}
