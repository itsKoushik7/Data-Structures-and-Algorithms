import java.util.Scanner;
public class AllDivisors {

    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in) );
        System.out.println("Enter the number to check the Divisors of it : ");
        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int gcd =1;
        for (int i = 1 ; i <= (num1 > num2 ? num1 : num2) ; i ++ ) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd =i;
            }
        }

        System.out.print("the gcd of given nummebr is : "+ gcd);
    }

    
}
