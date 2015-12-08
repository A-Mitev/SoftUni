import java.util.Scanner;

public class P3_Points_inside_a_Figure {
	public static void main(String[] args) {
		Scanner points = new Scanner(System.in);
		double x = points.nextDouble();
		double y = points.nextDouble();

		Boolean firstBox = (x >= 12.5) && (x <= 22.5) && (y >= 6) && (y <= 8.5);
		Boolean secondBox = (x >= 8.5) && (x <= 17.5) && (y >= 8.5)
				&& (y <= 13.5);
		Boolean thirdBox = (x > -20) && (x <= 22.5) && (y >= 8.5)
				&& (y <= 13.5);

		if (firstBox || secondBox || thirdBox) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}

	}
}
