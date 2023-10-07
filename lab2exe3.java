//lab02exe3

import java.util.Scanner;

public class lab2exe3{
	public static void main (String args[]){
		
		double length, width, height, volume;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the length :");
		
		//get length
		length=scanner.nextInt();
		System.out.print("length is :"+length);
		
		System.out.print("Enter the Width :");
		//get width
		width=scanner.nextInt();
		System.out.print("Width is :"+width);
		
		System.out.print("Enter the Height :");
		//get height
		height=scanner.nextInt();
		System.out.print("Height is : "+height);
		
		volume=height*width*length;
		
		System.out.print("Total volume is :"+volume);
		
		
		

		
		
		
		
		
	}
}