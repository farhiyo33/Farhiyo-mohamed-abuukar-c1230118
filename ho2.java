import java.util.Scanner;

public class ho2 {
    public static void main(String[] args) {
        System.out.println("enter numbers"+":");
        Scanner input= new Scanner(System.in);
        int no= input.nextInt();
        boolean isprime=true;
        for (int i=2; i<no; i++){
            if (no %i==0){
                isprime=false;
                break;
            }
        } if (isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("maaha");
        }
    }
}
