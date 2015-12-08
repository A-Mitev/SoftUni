import java.util.Scanner;

public class P4The_Smallest_of_3_Numbers {
	public static void main(String[] arrgs) {
		Scanner numbers = new Scanner(System.in);
		double a = numbers.nextDouble();
		double b = numbers.nextDouble();
		double c = numbers.nextDouble();
		double smallest;
		if (a < b && a < c) {
			smallest = a;
		} else if (b < a && b < c) {
			smallest = b;
		} else {
			smallest = c;
		}
		System.out.println(smallest);
	}
}		