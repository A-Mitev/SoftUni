import java.util.Scanner;

public class P3PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (isInside(x, y)){
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }


    }

    private static boolean isInside(double x, double y){
         boolean isInside = false;
        if ((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5)||
                (x >= 8.5 && x < 17.5 && y >= 8.5 && y <=13.5) ||
                (x >= 20 && x <= 22.5 && y >= 8.5 && y< 13.5)) {
            isInside = true;
        }
        return isInside;
    }

}