import java.util.Random;
import java.util.Scanner;

public class P6_Random_Hands_Of_Five_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hands = scanner.nextInt();

        String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        char[] suits = { '\u2660', '\u2665', '\u2666', '\u2663' };


        for (int i = 0; i < hands; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(faces[random.nextInt(faces.length)] + suits[random.nextInt(suits.length)] + " ");
            }
            System.out.println();
        }
    }
}
