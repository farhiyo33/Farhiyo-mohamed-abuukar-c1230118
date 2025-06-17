import java.util.Scanner;

public class ho {
    public static void main(String[] args) {
        //palindrome
        Scanner input=new Scanner(System.in);
        System.out.println("geli magaca" +":");
        String name=input.nextLine();
        boolean  ispalindrome=true;

        for (int i=0; i<name.length()/2; i++ ){

            if (name.charAt(i) != name.charAt(name.length() - 1 - i)){
                ispalindrome=false;
                break;
            }
        }
        if (ispalindrome){
            System.out.println("palindrome");
        } else {
            System.out.println("maahan");
        }

    }
}
