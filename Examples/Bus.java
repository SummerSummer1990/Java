public class Bus {
double fare;
int pass;
double money;

public Bus(double fare, int pass){//set object Bus 
	this.fare; //price of the bus ticket
	this.pass; //numbers of passengers
	money = pass*fare;}



public void stop(int on, int off){//determine numbers passengers
	if(pass>=off){
	pass = pass + on - off;}
	else{pass = 0;
	pass = on;}
	money = money+on*fare;//calculate money
}
public String toString(){
	return String.format("%s %.5e", pass, money);//print out
	
}


}
