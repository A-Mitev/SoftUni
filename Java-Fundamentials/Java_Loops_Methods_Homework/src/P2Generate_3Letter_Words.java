import java.util.Scanner;

public class P2Generate_3Letter_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String charracters = scanner.nextLine();


        for (int i = 0; i < charracters.length(); i++) {
            for (int j = 0; j < charracters.length(); j++) {
                for (int k = 0; k < charracters.length(); k++) {
                    System.out.println("" + charracters.charAt(i) + charracters.charAt(j) + charracters.charAt(k));
                }
            }
        }
    }
}
