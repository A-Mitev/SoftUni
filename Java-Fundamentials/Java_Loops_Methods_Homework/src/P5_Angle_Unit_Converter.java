import java.util.Scanner;

public class P5_Angle_Unit_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s");
            if (input[1].equals("deg")) {
                System.out.printf("%.6f rad\n", Double.parseDouble(input[0]) / 57.2957795);
            } else {
                System.out.printf("%.6f deg\n",Double.parseDouble(input[0]) * 57.2957795);
            }
        }
    }
}
