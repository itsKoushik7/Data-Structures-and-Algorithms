// package Data-Structures-and-Algorithms.BasicMath;

import java.util.Scanner;

public class CountDigits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits : ");
        int num = sc.nextInt();
        int count = 0;

        while(num > 0 ){

            count++;
            num =num/ 10;

        }
        System.out.println("Total Number of Digits : "+ count);
    
    }

}
