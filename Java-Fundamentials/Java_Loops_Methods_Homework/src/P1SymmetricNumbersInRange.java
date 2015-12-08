import java.util.Scanner;

public class P1SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] num = scanner.nextLine().split("\\s+");
//        int start = Integer.parseInt(num[0]);
//        int end = Integer.parseInt(num[1]);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start ; i < end; i++) {
            String number = "" + i;
            String revNumber = new StringBuilder(number).reverse().toString();
            if (number.equals(revNumber)){
                System.out.println(number);
            }

        }

    }
}

