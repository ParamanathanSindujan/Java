//it21158568
//sindujan p
//Assignment oop

import java.util.Scanner;

public class RoomChargeCalculator{
	

	// declare scanner variable
	public static Scanner in = new Scanner(System.in);

	//input answer
	public static String yesNo;

	//RoomChargeCalculator fixed fees
	public static int deluxDoublefixedPrice = 5000;
	
	//standard Family fixed fees
	public static int standardFamilyfixedPrice = 3000;
	
	//standard Single fixed fees
	public static int standardSinglefixedPrice = 2000;

	//Additional charge for balcony
	public static int balconyPrice = 500;
	
	//Additional charge for parking price
	public static int parkingPrice = 200;
	
	//Additional charge for tv 
	public static int tvPrice = 200;
	
	//Additional charge for kitchen
	public static int kitchenPrice = 1000;
	
	//Additional charge for wifi
	public static int wifiPrice = 100;
	
	//Additional charge for garden
	public static int gardenPrice = 200;
	
	//Additional charge for ac
	public static int acPrice = 500;

 // main method staring here.......................................
	public static void main(String[] args) {
		

		//ask from the user these kind of things (1 to 4) 
		//out of (1 to 4) invalid input
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\tplese select 1 to 4 for get facilities:");
		System.out.println();
  
 //show delux room 
		System.out.println("\t\t1#\t"+"Delux Double Room");
 //newline
		System.out.println();
  
  
 //show standard Family room
		System.out.println("\t\t2#\t"+"Standard Family Room");
 //newline
		System.out.println();
  
  
 //show standard Single room
		System.out.println("\t\t3#\t"+"Standard Single Room");
 //newline
		System.out.println();
  
  
 //show quit word
		System.out.println("\t\t#4\t"+"Quit");
 //newline
		System.out.println();
  
  
  
 //get user input
		System.out.println("\t\t------------------------------------------------");
		System.out.println("\t\tPlease Enter Number 1-4 For get facilities : ");
		System.out.println("\t\t------------------------------------------------");
 //newline
		System.out.println();
 //scan user input
		int chooseNum = in.nextInt();
  

// use switch case for user action
		switch (chooseNum){
			
			
	  
			case 1:
			System.out.println();
			System.out.println("\t\t\tDelux Double room  fixed fee :" + deluxDoublefixedPrice + "\n");
			System.out.println();
   
   // show additional service
			System.out.println("\t\t------------------------------------------------");
			System.out.println("\t\tPlease select Our aditional services :");
			System.out.println("\t\t------------------------------------------------");
			System.out.println();
   
   
   //show balcony fee
			System.out.println("\t\tFor Balcony Charge: " + balconyPrice);
			System.out.println();
   //show parking fee
			System.out.println("\t\tFor Parking Charge: " + parkingPrice);
			System.out.println();
   //show tv fee
			System.out.println("\t\tFor TV Charge: " + tvPrice);
			System.out.println();
   //show kitchen fee
			System.out.println("\t\tFor Kitchen Charge: " + kitchenPrice);
			System.out.println();
   //show wifi fee
			System.out.println("\t\tFor WiFi Charge: " + wifiPrice);
			System.out.println();
			System.out.println();
   

   // ask additional fees
			System.out.print("\t\tDo you need more service? Yes/No: ");
			yesNo = in.next();

   //get conformation
			if (yesNo.toLowerCase().equals("yes")) {
				System.out.println();
				System.out.println();
				System.out.println();
    
    // balcony facilities
				System.out.print("\t\t\tDo you need balcony? yes/no: ");
				String balcony = in.next();
				boolean balconyConfirmed = confirmExtra(balcony);
				System.out.println();
    // System.out.println(balconyConfirmed);

    // parking facilities
				System.out.print("\t\t\tDo you need Parking? yes/no: ");
				String parking = in.next();
				boolean parkingConfirmed = confirmExtra(parking);
				System.out.println();
    // System.out.println(parkingConfirmed);

    // TV facilities
				System.out.print("\t\t\tDo you need TV? yes/no: ");
				String tv = in.next();
				boolean tvConfirmed = confirmExtra(tv);
				System.out.println();
    // System.out.println(tvConfirmed);

    // kitchen facilities
				System.out.print("\t\t\tDo you need Kitchen? yes/no: ");
				String kitchen = in.next();
				System.out.println();
				boolean kitchenConfirmed = confirmExtra(kitchen);

    // wifi facilities
				System.out.print("\t\t\tDo you need WiFi? yes/no: ");
				String wifi = in.next();
				System.out.println();
				boolean wifiConfirmed = confirmExtra(wifi);

		// calling the method
				getChargeDeluxDouble(balconyConfirmed, parkingConfirmed, tvConfirmed, kitchenConfirmed, wifiConfirmed);
			} else {
				System.out.println("\t\t-----------------------------------------------");
				System.out.println("\t\tYour total Room fee : "  + deluxDoublefixedPrice);
				System.out.println("\t\t-----------------------------------------------");
				}	
				break;
   
   
   //case 02-------------------------------------------------------
			case 2:
			System.out.println();
			System.out.println("\t\t\tStandard Family room fixed price: " + standardFamilyfixedPrice + "\n");
			System.out.println();
   
			kitchenPrice=500;
   
   // show additional service
			System.out.println("\t\t------------------------------------------------");
			System.out.println("\t\tPlease select Our aditional services :");
			System.out.println("\t\t------------------------------------------------");
			System.out.println();
   
   //show parking fee
			System.out.println("\t\tFor Parking Charge: " + parkingPrice);
			System.out.println();
   
   //show kitchen fee
			System.out.println("\t\tFor Kitchen Charge: " + kitchenPrice);
			System.out.println();
   
   //show garden fee
			System.out.println("\t\tFor Garden Charge: " + gardenPrice);
			System.out.println();
   
   
   

   // user answer input
			System.out.print("\t\tDo you need our extra services? Yes/No: ");
			yesNo = in.next();

   // get condition
			if (yesNo.toLowerCase().equals("yes")) {
				System.out.println();

    // parking condition
				System.out.print("\t\tDo you need Parking? yes/no: ");
				String parking = in.next();
				boolean parkingConfirmed = confirmExtra(parking);

    // kitchen condition
				System.out.print("\t\tDo you need Kitchen? yes/no: ");
				String kitchen = in.next();
				boolean kitchenConfirmed = confirmExtra(kitchen);

    // garden condition
				System.out.print("\t\tDo you need Garden? yes/no: ");
				String garden = in.next();
				boolean gardenConfirmed = confirmExtra(garden);

    
				getChargeStandardFamily(parkingConfirmed, kitchenConfirmed, gardenConfirmed);
				} else {
						System.out.println("\t\t-----------------------------------------------");
						System.out.println("\t\tYour total Room fee : "  + standardFamilyfixedPrice);
						System.out.println("\t\t-----------------------------------------------");
						}
						break;

			case 3:
  
			System.out.println();
			System.out.println("\t\t\tStandard Single Fixed Price: " + standardSinglefixedPrice + "\n");
			System.out.println();
   
   // show additional item service
  
			System.out.println("\t\t------------------------------------------------");
			System.out.println("\t\tPlease select Our aditional services :");
			System.out.println("\t\t------------------------------------------------");
			System.out.println();
   
   //parking fee
			System.out.println("\t\tFor Parking Charge: " + parkingPrice);
			System.out.println();
   //ac fee
			System.out.println("\t\tFor AC Charge: " + acPrice);
			System.out.println();
   
   //wifi fee
			System.out.println("\t\tFor WiFi Charge: " + wifiPrice);
			System.out.println();
   
   
   
   
  
   // check condition for the user
			System.out.print("\t\tDo you need our extra services?Yes/No: ");
			yesNo = in.next();

   // check condition for the user
			if (yesNo.toLowerCase().equals("yes")) {
				System.out.println();
				System.out.println();
				System.out.println();
    
    // ask about needs
				System.out.print("\t\tDo you need Parking? yes/no: ");
				String parking = in.next();
				boolean parkingConfirmed = confirmExtra(parking);
				System.out.println();

    // ask about needs
				System.out.print("\t\tDo you need AC? yes/no: ");
				String ac = in.next();
				boolean acConfirmed = confirmExtra(ac);
				System.out.println();

    // ask about needs
				System.out.print("\t\tDo you need Wifi? yes/no: ");
				String wifi = in.next();
				boolean wifiConfirmed = confirmExtra(wifi);
				System.out.println();

    // ask about needs
				getChargeStandardSingle(parkingConfirmed, acConfirmed, wifiConfirmed);
			} else {
				System.out.println("\t\t-----------------------------------------------");
				System.out.println("\t\tYour total Room fee : "  + standardSinglefixedPrice);
				System.out.println("\t\t-----------------------------------------------");
		}
		break;
			case 4:
			System.out.println("//You are selcted to quit//");
			in.close();
			break;

			default:
			System.out.println("\t\t***	Invalid input"+"next time please select 1 to 4	***");
			in.close();
			break;
		}
	}

 
			public static boolean confirmExtra(String answer) {
			boolean confirm;
			if (answer.toLowerCase().equals("yes")) {
				confirm = true;
				} else {
					confirm = false;
					}
					
						return confirm;
		
					}

 
			public static int getPrice(boolean action, int price) {

			if (action == true) {
			return price;
			} else {
				price = 0;
				return price;
				}
			}

		// get price delux double room 
		public static void getChargeDeluxDouble(boolean balcony, boolean parking, boolean tv, boolean kitchen,
		boolean wifi) {

  // input all prices
		int getBalconyPrice = getPrice(balcony, balconyPrice);
		int getParkingPrice = getPrice(parking, parkingPrice);
		int getTvPrice = getPrice(tv, tvPrice);
		int getKitchenPrice = getPrice(kitchen, kitchenPrice);
		int getWifiPrice = getPrice(wifi, wifiPrice);

  // calculate total price
		int totalPrice = deluxDoublefixedPrice + getBalconyPrice + getParkingPrice + getTvPrice + getKitchenPrice + getWifiPrice;
		System.out.println("\t\t===================================");
		System.out.println("\t\tYour total Room Charge : "  + totalPrice);
		System.out.println("\t\t===================================");
	}	

 // calculate room charge for Standard Family room
		public static void getChargeStandardFamily(boolean parking, boolean kitchen, boolean garden) {

  // get prices for chosen option
		int getParkingPrice = getPrice(parking, parkingPrice);
		int getKitchenPrice = getPrice(kitchen, kitchenPrice);
		int getGardenPrice = getPrice(garden, gardenPrice);

  // calculate total price
		int totalPrice = standardFamilyfixedPrice + getParkingPrice + getKitchenPrice + getGardenPrice;
		System.out.println("\t\t===================================");
		System.out.println("\t\tYour total Room Charge : "  + totalPrice);
		System.out.println("\t\t===================================");
 }

 // calculate room charge for Standard Family room
		public static void getChargeStandardSingle(boolean parking, boolean ac, boolean wifi) {

  // get prices for chosen option
		int getParkingPrice = getPrice(parking, parkingPrice);
		int getAcPrice = getPrice(ac, acPrice);
		int getWifiPrice = getPrice(wifi, wifiPrice);

  // calculate total price
		int totalPrice = standardSinglefixedPrice + getParkingPrice + getAcPrice + getWifiPrice;
	
		System.out.println("\t\t===================================");
		System.out.println("\t\tYour total Room Charge : " + totalPrice);
		System.out.println("\t\t===================================");
		
 }
 //sorry ugley indent

}




