import java.util.*;
import java.util.Scanner;

public class feo{
	public static void main(String args[]){
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number one : ");
		int n1=scanner.nextInt();
		
		
		
		if(n1%2==0)
		{
			System.out.println(n1%2==0);
		}
		
		else if(n1%2==1){
			System.out.println("this is odd number"+n1);
		}
		else{
			System.out.println("Invalid number");
			
		}
		
		
	}
}