//get input using from bufferreader

import java.io.*;
import java.util.*;

public class bufferreader{
	public static void main(String args[]){
		
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Your name is :");
			
			String name =reader.readLine();
			System.out.println("your name you typed is :"+name);
		} 
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		//
		// using Console
        Console console = System.console();
        if (console == null) {
            System.out.println("No console: not in interactive mode!");
            System.exit(0);
        }
 
        System.out.print("Enter your username: ");
        String username = console.readLine();
         
        System.out.print("Enter your password: ");
        char[] password = console.readPassword();
 
        System.out.println("Thank you!");
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + String.valueOf(password));
	}
}