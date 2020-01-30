package ie.gmit.labweek3;
import java.util.Scanner;

public class ForLoopIte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ForLoopIte a = new ForLoopIte();

        System.out.print("We are going to count from 1 to N.\n PLease enter N: ");
        int n = input.nextInt();

        a.counter(n);
        input.close();

    }

    void counter(int n) {
    String output = "";
        for (int i = 1; i <= n; i++) {
            output += i +"\n";
        }
    System.out.println(output);
    } 
}