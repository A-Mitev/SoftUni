import java.util.Scanner;

public class P1RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("First size = %s  Second size = %s Rectangle Area = %d",a, b, a*b);
    }
}
