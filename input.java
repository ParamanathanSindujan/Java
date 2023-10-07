 import java.util.Scanner;
 
 public class input{
	 public static void main(String args[]){
		int num1 , num2 , sum;
		double avg;
		num1=0;
		num2=0;
		sum=0;
		avg=0;
		
		Scanner myScanner =new Scanner(System.in);
		
		//get num1
		
		System.out.println("Enter the num 1 :");
		num1=myScanner.nextInt();
		
		//get num2
		System.out.println("Enter the num 2 :");
		num2=myScanner.nextInt();
		
		//sum
		sum=num1+num2;
		//avg 
		avg=sum/2;
		
		System.out.println("the sum is : "+ sum);
		System.out.println("the avg is :"+avg);
		
		
	 }
 }