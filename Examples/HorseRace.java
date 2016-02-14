import java.util.Scanner;

public class HorseRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//set an array space for Array
		while(in.hasNext()){
		int k = 0;
		HorseObject[] HorseArray = new HorseObject[5]; 
		for(int i=0;i<5;i++){//store 5 lines into the horse object
			
			String name = in.next();
			int speed = in.nextInt();
			boolean elgible = in.nextBoolean();
			//store the eligible horses to object
			HorseArray[i] = new HorseObject(name, speed, elgible);
			//end of if
			
			}//end of storing
		
		String race = race(HorseArray);
		System.out.print("Winner: "+ race+" ");//print out winner horse
		System.out.print("Eligible: ");
		for(int j =0; j<HorseArray.length;j++){//print out all the eligible horses
			if(HorseArray[j].isElgible()==true )
				System.out.print(HorseArray[j].toString()+" ");
		}//end of for
		System.out.println("");
	}//end of while
}//end of main
	
	
	public static String race(HorseObject[] HorseArray){//run a race to determine fast horse
		double largest = Double.MIN_VALUE;
		String winner = "";
		for (int i=0;i<5;i++){//determine the fastest speed
			if(HorseArray[i].isElgible()==true ){
			if( HorseArray[i].getSpeed() >= largest){
					largest = HorseArray[i].getSpeed();}
				else {}	}
			}
		for (int i=4;i>=0;i--){//determine the fastest horse
			if(HorseArray[i].isElgible()==true )
			{if(HorseArray[i].getSpeed() >= largest)
			{
				winner = HorseArray[i].toString();
		}
			else {}}
			else{}
			
		}
		return winner;
		
	}

}

class HorseObject {
	private int speed;
	private String name = "";
	private boolean elgible;
	
	public HorseObject(String name1, int speed1, boolean elgible1){
		name = name1;
		speed = speed1;
		elgible = elgible1;
	}

	public int getSpeed(){return speed;}//return speed
	
	public boolean isElgible(){return elgible;}//return true or false
	
	public String toString(){//print
		return "("+name+", " +speed+")";
	}
}
