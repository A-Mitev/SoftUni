import java.util.Scanner;

public class P3_Full_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] faces = {"2","3", "4", "5", "6", "7","8", "9","10", "J", "Q", "K", "A"};
        char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
        int count = 0;
        for (int card1 = 0; card1 < faces.length; card1++) {
            for (int card2 = 0; card2 < faces.length; card2++) {
                for (int suit1 = 0; suit1 < suits.length; suit1++) {
                    for (int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
                        for (int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
                            for (int suit4 = 0; suit4 < suits.length; suit4++) {
                                for (int suit5 = suit4 + 1; suit5 < suits.length; suit5++) {
                                    if (faces[card1] != faces[card2]) {
                                        System.out.printf("%1$s%3$s %1$s%4$s %1$s%5$s %2$s%6$s %2$s%7$s\n",
                                                faces[card1],
                                                faces[card2],
                                                suits[suit1],
                                                suits[suit2],
                                                suits[suit3],
                                                suits[suit4],
                                                suits[suit5]);
                                        count++;

                                    }}}}}}}}
        System.out.printf("Total combinations: %d", count);}}




