import java.util.Scanner;
public class ArmStrongNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the Number to Check the Palindrome Number : ");
        int num = sc.nextInt();

        int num1 = num ;
        int sum =0;

        while (num1 > 0) {
            int last = num1 % 10 ;
            sum = sum + (last*last*last);
            num1 /= 10;

        }

        if(num == sum ) {
            System.out.println("Given Number is ArmStrong Numebr  "+ num +"  "+ sum );
        }
        else {
            System.out.println("the Givn number is not an armstrong Number : "+ num + sum);
        }
    }
    
}
