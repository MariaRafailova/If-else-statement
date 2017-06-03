import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете x1, което да е от 1 до 8");
		int x1 = sc.nextInt();
		System.out.println("Моля въведете y1, което да е от 1 до 8");
		int y1 = sc.nextInt();
		System.out.println("Моля въведете x2, което да е от 1 до 8");
		int x2 = sc.nextInt();
		System.out.println("Моля въведете y2, което да е от 1 до 8");
		int y2 = sc.nextInt();

		if (x1>=1 && x1<=8 && x2>=1 && x2<=8 && y1>=1 && y1<=8 && y2>=1 && y2<=8) {
			
			if (((x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0)
					|| ((x1 + y1) % 2 != 0 && (x2 + y2) % 2 != 0)) {
				System.out.println("Позициите са с еднакъв цвят");
			} else {
				System.out.println("Позициите са с различен цвят");
			}
			
		}
		else {
			System.out.println("Поне едно от числата x1, x2, y1 или y2 не е от 1 до 8");
		}
	}
}
