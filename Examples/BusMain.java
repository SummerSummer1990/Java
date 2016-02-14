import java.util.Scanner;
public class BusMain{
   public static void main(String [] args){
       Scanner in = new Scanner(System.in);
       while(in.hasNext()){
       double fare = in.nextDouble();
       int pass = in.nextInt();
       
       Bus bus = new Bus(fare, pass);//set a new object      
       for(int i=1; i<4;i++){
    	   int on = in.nextInt();
    	   int off = in.nextInt();
    	   bus.stop(on, off);//determin remaining passenger
       }
       System.out.print(bus.toString());//print out
       }}}
