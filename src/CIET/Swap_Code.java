package CIET;
import java.util.Scanner;

public class Swap_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap : " + a);
		System.out.println("After Swapping : " + b);
		sc.close();
	}
}
