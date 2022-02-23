
public class Main
{
	public static void main(String[] args) {
	
	int a = -10;
	float b = 123.45f;
	String str = "java";
	
	System.out.printf("%5d\n", a); // total length will be 5 inclduing white spaces and number
	System.out.printf("%6.1f\n",b); //total length of digit will be 6 and 1 digit will be printed after decimal
	System.out.printf("%-20s", str); //print 20 white spaces after java
	}
}
