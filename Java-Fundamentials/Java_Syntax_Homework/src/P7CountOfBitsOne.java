import java.util.Scanner;

public class P7CountOfBitsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();

        int count = 0;
        for (int bit = 0; bit < 64; bit++) {
            long currentBit = (number >> bit) & 1L;
            if (currentBit == 1){
                count ++;
            }
        }
        System.out.println(count);
    }
}
