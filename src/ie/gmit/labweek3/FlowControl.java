package ie.gmit.labweek3;
import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlowControl a = new FlowControl();
        int month;

        System.out.print("Enter the number of your birth month: ");
        month = sc.nextInt();

        a.birthMonthFinderSwitch(month);
        a.birthMonthFinderIfElse(month);
        sc.close();
    }

    //write with Switch
    public void birthMonthFinderSwitch(int month) {
        switch (month) {
            case 1:
                System.out.println("You were born in January.");
            break;
            case 2:
                System.out.println("You were born in February.");
            break;
            case 3:
                System.out.println("You were born in March.");
            break;
            case 4:
                System.out.println("You were born in April.");
            break;
            case 5:
                System.out.println("You were born in May.");
            break;
            case 6:
                System.out.println("You were born in June.");
            break;
            case 7:
                System.out.println("You were born in July.");
            break;
            case 8:
                System.out.println("You were born in August.");
            break;
            case 9:
                System.out.println("You were born in September.");
            break;
            case 10:
                System.out.println("You were born in October.");
            break;
            case 11:
                System.out.println("You were born in November.");
            break;
            case 12:
                System.out.println("You were born in December.");
            break;
            default:
                System.out.println("Invalid number - please enter number from 1 to 12.");
            break;
        }
    }

//write with if-else
    public void birthMonthFinderIfElse(int month) {
        if (month >=1 && month <= 12) {
            if (month == 1) {
                System.out.println("You were born in January.");
            } else if (month == 2) {
                System.out.println("You were born in February.");
            } else if (month == 3) {
                System.out.println("You were born in March.");
            } else if (month == 4) {
                System.out.println("You were born in April.");
            } else if (month == 5) {
                System.out.println("You were born in May.");
            } else if (month == 6) {
                System.out.println("You were born in June.");
            } else if (month == 7) {
                System.out.println("You were born in July.");
            } else if (month == 8) {
                System.out.println("You were born in August.");
            } else if (month == 9) {
                System.out.println("You were born in September.");
            } else if (month == 10) {
                System.out.println("You were born in October.");
            } else if (month == 11) {
                System.out.println("You were born in November.");
            } else {
                System.out.println("You were born in December.");
            }
        } else {
            System.out.println("Invalid number - please enter number from 1 to 12.");
        }
    }


}