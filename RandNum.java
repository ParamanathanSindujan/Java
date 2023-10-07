//it21158568
//sindujan p
//malabe


class RandNum{
	private int[][] arr = new int[5][5];
	
	//generate a random  in 2D Array for exe2
	public RandNum(){
		
		int max1 = 100;
	    int min1 = 1;
	    int range1 = max1 - min1 +1;
	  
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				this.arr[i][j] = (int) (Math.random() * range1) ;
			}
		}
	}
	
	//Taka min number in 2d array 
	public int minNum2(){
		int lower2 = 1000;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(lower2 > this.arr[i][j])
				{
					lower2 = this.arr[i][j];
				}
			}
		}
		return lower2; //get min number
	}
	
	
	//Take max number in 2d array 
	public int maxNum3(){
		int high3 = minNum2();
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(high3 < this.arr[i][j])
				{
					high3 = this.arr[i][j];
				}
			}
		}
		return high3; //return MAX value
	}
	
	
	//Take average of 2d array 
	public double avarage(){
		int sum = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				sum= this.arr[i][j] + sum;
			}
			
		}
		return sum/25; // output(print) count
	}
	
	public   void display(RandNum num ){
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("________________________________________________________");
		System.out.println("#####\t5x5 2D array of 25 integers\t#####");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(this.arr[i][j] + "\t");
				
			}
			System.out.print("\n");
		}
		
		System.out.println("________________________________________________________");
		System.out.print("\tThe min number, ");
		System.out.print("\tThe max number, ");
		System.out.print("\tThe avg number, ");
		System.out.println();
		System.out.println("________________________________________________________");
		
		
		
		System.out.println("Minimum Number :  "+num.minNum2());
		System.out.println("Maximum Number :  "+num.maxNum3());
		System.out.println("Avarage Number :  "+num.avarage());
		
	
	}
	
	public static void main(String args[]){
		RandNum num = new RandNum();
		num.display(num);
		
	}
		
}