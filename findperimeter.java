import java.util.*;

public class findperimeter{
	public static void main(String args[])
	{
		double length,width,perimeter;
		
		Scanner myscanner= new Scanner(System.in);
		
		System.out.printf("Enter the width : ");
		width=myscanner.nextInt();
		
		System.out.printf("Enter the length :");
		length=myscanner.nextInt();
		
		perimeter=(length+width)*2;
		
		System.out.println("Width is :"+ width);
		System.out.println("\t length is : "+ length );
		System.out.println( "= " + perimeter);
		
		
		
	}
}
