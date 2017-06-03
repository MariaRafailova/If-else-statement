import java.util.Scanner;


public class Task13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете цяло число между -100 и 100:");
	int t = sc.nextInt();
	
	if(t >= -100 && t <= 100){
		
		if(t < -20){
			System.out.println("ледено студено");			
		}
		else if(t >= -20 && t <= 0){
			System.out.println("студено");
		}
		else if(t > 0 && t <= 15){
			System.out.println("студено");
		}
		else if(t > 15 && t <= 25){
			System.out.println("топло");
		}
		else if(t > 25){
			System.out.println("горещо");
		}
		
	}
	else{
		System.out.println("Невалидно число");
	}	
}
}
