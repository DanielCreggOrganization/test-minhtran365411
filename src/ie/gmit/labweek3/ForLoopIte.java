package ie.gmit.labweek3;
import java.util.Scanner;

public class ForLoopIte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ForLoopIte a = new ForLoopIte();

        System.out.print("We are going to count from 1 to N.\nPLease enter N: ");
        int n = input.nextInt();

        a.counterFor(n);
        input.close();

    }

    void counterFor(int n) {
    String output = "";
        for (int i = 1; i <= n; i++) {
            output += i +"\n";
        }
    System.out.println("Print by for loop: \n"+output);
    } 

    void counterWhile(int n) {
        String output = "";
        int i = 1;

        while (i <= n) {
            output += i +"\n";
            i++;
        }
        System.out.println("Print by while loop: \n"+output);
    }
}