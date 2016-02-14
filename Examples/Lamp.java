public class Lamp {
	String name;
	boolean status;

	
	public Lamp(String s){
		name = s;	
	}//set name of the Lamp
	public void turnOn(){
		status = true;
	}//set status as on
	public void turnOff(){
		status = false;
	}//set status as off
	public boolean isOn(){
		return status;
	}//return the value if status
	public String toString(){
		String output;
		if(status == true){ 
				return name + " is "+ " ON ";
	}
		else{
			return name + " is "+ " OFF ";
		}
		}


}
