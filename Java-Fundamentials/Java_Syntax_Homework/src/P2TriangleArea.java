import java.util.Scanner;

public class P2TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();
        int cX = scanner.nextInt();
        int cY = scanner.nextInt();

        int area = (aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY)) /2;
        if(area < 0 ){
            area = area * -1;
        }

        System.out.println(area);
    }
    }

