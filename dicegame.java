import java.util.Random;
import java.util.Scanner;
public class dicegame{
    public static void main(String args[]){
	int data1,data2,sum;
	String name;
	Scanner sca= new Scanner(System.in);
	System.out.println("What is your name?");
	System.out.print("> ");
	name=sca.next();
	System.out.println("Hello, "+name+"!");	
	Random rand = new Random();
	System.out.println("Rolling the dice...");
	data1=rand.nextInt(6)+1;
	System.out.println("Die 1: "+data1);
	data2=rand.nextInt(6)+1;
	System.out.println("Die 2: "+data2);
	sum=data1+data2;
	System.out.println("Total value: "+sum);
	if(sum>7){
	System.out.println(name+" won!");
	}else{
	System.out.println(name+" lost");
	}
    }
}
