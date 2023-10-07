public class exe4{
	public static void main (String args[]){
		
		int nday;
		String day;
		nday=3;
		
		System.out.println("the day is :"+ nday);
		
		switch(nday){
			case 1:day="monday";
			break;
			
			case 2:day="tuesday";
			break;
			
			case 3:day="wednesday";
			break;
			
			case 4:day="thursday";
			break;
			
			case 5:day="friday";
			break;
			
			case 6:day="suterday";
			break;
			
			case 7:day="sunday";
			break;
			
			default : day="invalid day";
			break;
		}
		
		System.out.println("day of the week :"+day);
		
		
		
	}
}