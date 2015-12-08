import java.util.Scanner;

public class P4TheSmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(min(a, b, c));


    }
    private static double min(double a, double b, double c){
        return Math.min(Math.min(a, b), c);
    }
}
