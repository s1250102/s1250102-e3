import java.util.Random;
public class dicegame{
    public static void main(String args[]){
	int data1,data2,sum;
	Random rand = new Random();
	System.out.println("Rolling the dice...");
	data1=rand.nextInt(6)+1;
	System.out.println("Die 1: "+data1);
	data2=rand.nextInt(6)+1;
	System.out.println("Die 2: "+data2);
	sum=data1+data2;
	System.out.println("Total value: "+sum);
	if(sum>7){
	System.out.println("You won");
	}else{
	System.out.println("You lost");
	}
    }
}
