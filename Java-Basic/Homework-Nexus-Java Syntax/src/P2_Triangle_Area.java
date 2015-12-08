import java.util.Scanner;

public class P2_Triangle_Area {
	public static void main(String[] args) {
		Scanner side = new Scanner(System.in);
		int Ax = side.nextInt();
		int Ay = side.nextInt();
		side.nextLine();
		int Bx = side.nextInt();
		int By = side.nextInt();
		side.nextLine();
		int Cx = side.nextInt();
		int Cy = side.nextInt();
		side.nextLine();
		double area = Math.abs((Ax*(By-Cy)) + (Bx*(Cy-Ay)) + (Cx*(Ay - By)))/2;
		int roundedArea = (int)area;
		System.out.println(roundedArea);
	}
}
