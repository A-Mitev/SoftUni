import java.util.Scanner;

public class P5_Decimal_to_Hexadecimal {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int decimal = number.nextInt();
		String hex = Integer.toHexString(decimal);
		System.out.printf("%S", hex);
	}
}
