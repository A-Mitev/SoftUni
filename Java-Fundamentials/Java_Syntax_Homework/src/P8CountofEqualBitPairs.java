import java.util.Scanner;

public class P8CountofEqualBitPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String binary = Integer.toBinaryString(num);
        int count = 0;
        for (int i = 0; i < binary.length() ; i++) {
            int currrentBit = (num >> i) & 1;
            int secondBit = (num >> (i + 1)) & 1;
            if (currrentBit == secondBit){
                count++;
            }
        }
        System.out.println(count);
    }

}

