import java.util.Scanner;


public class Task7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter an hour");
	int hour = sc.nextInt(); //not used 
	System.out.println("Please enter money");
	double money = sc.nextDouble();
	System.out.println("Please enter if I am healthy");
	boolean sick = sc.nextBoolean();
	
	if(sick){
		if(money != 0){
			System.out.println("I'll buy medicine");
		}
		else{
			System.out.println("I'll stay at home and will drink tea");
		}
	}
	else{
		if(money <=10){
			System.out.println("Go to cofe");
		}
		else{
			System.out.println("I'll go to the cinema with my friends");
		}
	}	
}
}
