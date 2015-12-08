import java.util.Scanner;

public class P7_Count_of_Bits_One {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int bitOneCount = Integer.bitCount(n);
		System.out.println(bitOneCount);
	}
}
