import java.util.Scanner;


public class Task14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете x1");
	int x1 = sc.nextInt();
	System.out.println("Моля въведете y1");
	int y1 = sc.nextInt();
	System.out.println("Моля въведете x2");
	int x2 = sc.nextInt();
	System.out.println("Моля въведете y2");
	int y2 = sc.nextInt();
	
	if(((x1 + y1)%2 ==0 && (x2 + y2)%2 ==0)||((x1 + y1)%2 !=0 && (x2 + y2)%2 !=0)){
		System.out.println("Позициите са с еднакъв цвят");
	}
	else{
		System.out.println("Позициите са с различен цвят");
	}
}
}
