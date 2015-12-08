import java.util.Scanner;

public class P6_Formatting_Numbers {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		int a = numbers.nextInt();
		double b = numbers.nextDouble();
		double c = numbers.nextDouble();
		String hex = Integer.toHexString(a);
		String binary = Integer.toString(a, 2);
		System.out.printf("|%-10S|%010d|%10.2f|%-10.3f|", hex, Integer.parseInt(binary), b, c);
	}
}
