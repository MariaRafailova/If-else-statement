import java.util.Scanner;


public class Task16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете 3-цифрено число:");
	int abc = sc.nextInt();
	
	int c = abc%10;
	int ab = abc/10;
	int b = ab%10;
	int a = ab/10;
	
	if(a==b && b==c){
		System.out.println("цифрите са равни");
	}
	else if(a>b && b>c){
		System.out.println("цифрите са в низходящ ред");
	}
	else if(a<b && b<c){
		System.out.println("цифрите са във възходящ ред");
	}
	else{
		System.out.println("цифрите са ненаредени");
	}
}
}
