import java.util.Random;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter password");
        int length = input.nextInt();
        String pass = "";
        String special = "@!$#%^&*";
        for (int i = 0; i < length; i++){
        int w = random.nextInt(4);
            char ch;
            if (w == 0) {
                ch = (char) ('A' + random.nextInt(26));
            } else if (w == 1) {
                ch = (char) ('a' + random.nextInt(26));
            } else if (w == 2) {
                ch = (char) ('0' + random.nextInt(10));

            } else {
                ch = special.charAt(random.nextInt(special.length()));
            }
            pass = pass + ch;

        }
        System.out.println("your password is;"+ pass);
    }
}
