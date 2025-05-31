import java.util.Scanner;
public class CheckPalindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the Number to Check the Palindrome Number : ");
        int num = sc.nextInt();
        int num1 = num;
        int revNum= 0;

        while  (num1 > 0) {
            revNum = revNum * 10 + (num1%10) ;
            num1 = num1/10;
        }

        if(revNum == num) {
            System.out.println("The givemn Number is Palindrome Numebr");
        }
        else {
            System.out.println("The given number is not a palindrome number");
        }

    }
    
}
