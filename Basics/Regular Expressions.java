
public class Main
{
	public static void main(String[] args) 
	{
	    String str1 = "a";
	    System.out.println(str1.matches(".")); //true if str has only any single character, else false
	    
	    String str2 = "A";
	    System.out.println(str2.matches("[ABC]")); //any single alphabet other than a, b or c will result false
	    
	    String str3  = "P";
	    System.out.println(str3.matches("[^ABC]")); //any single alphabet other than a,b or c will be true
	    
	    String str4 = "X";
	    System.out.println(str4.matches("[A-Z1-9]")); //any single alphabet in range of A-Z or 1-9
	    
	    String str5 = "a6";
	    System.out.println(str5.matches("[a-z][0-9]")); //any two characters, first betweem a-z and second between 0-9
	    
	    String str6 = "abc";
	    System.out.println(str6.matches("abc")); //string should be exactly "abc"
	    
	    String str7 = "a";
	    System.out.println(str7.matches("a|b")); //string should be either a or b
	}
}
