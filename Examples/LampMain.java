import java.util.Scanner;

public class LampMain {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

while(in.hasNext()){
	int num = in.nextInt();
	Lamp[] lampArray = new Lamp[num];
String name;
	for(int i=0;i<num;i++){
		name = in.next();//read name
		lampArray[i]  = new Lamp(name);}//set name for lamp[]
int status1;
	for(int j=0;j<num;j++){	
		status1 = in.nextInt();//read ints
		if (status1 == 1){lampArray[j].turnOn();}//lamp is on} 
		else{lampArray[j].turnOff();}//lamp if off
	}
		//lampArray[j].isOn();//set the status for lamp[]
		 for(int k = 0; k < num; k++){String s = lampArray[k].toString();
		 System.out.print(s);
		 }//print out 
		 System.out.println();
	}}
}
