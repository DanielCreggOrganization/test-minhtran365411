package ie.gmit.labweek3;
import java.util.Scanner;

public class DoWhileSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double num = 1;

    do {
        System.out.print("Enter a number to sum up - enter '0.0' to end loop: ");
        num = input.nextDouble();
        sum += num;
    } while ( num != 0.0);

    System.out.println("Sum of all entered numbers is: "+sum);
    input.close();
}
}