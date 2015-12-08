import java.util.Scanner;

public class P5DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String hex = Integer.toHexString(input);

        System.out.println(hex);
    }
}
