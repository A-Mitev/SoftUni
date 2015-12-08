import java.util.Scanner;

public class P6FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String hex = Integer.toHexString(a);
        String binary = Integer.toString(a, 2);
        String b2 = String.format("%10s", binary).replace(' ', '0');

        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", hex.toUpperCase(), b2, b, c);
    }
}
