import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());

        System.out.println(date);
    }
}
