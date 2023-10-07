import java.util.*;

public class findoddeven{
	public static void main(String args[])
	{
		int arr[] = new int[10];
		int even=0,odd=0;
		
		
		for(i=0;i<10;++i)
		{
			System.out.println("Enter the number :");
			
			Scanner myscanner=new scanner(System.in);
			
			arr[i]=myscanner.nextInt();
			
		if(arr[i]%2==2){
			
			++even;
			esle{
				++odd;
			}
			
		}
		
		System.out.println("there are :"+even);
		
		
		
		
		
	}
}
