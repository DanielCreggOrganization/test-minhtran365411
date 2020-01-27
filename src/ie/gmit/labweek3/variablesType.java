package ie.gmit.labweek3;

public class variablesType {
    public static void main(String[] args) {
        boolean alive = true;
        byte age = 20;
        char iniName = 'M';
        short height = 156;
        int phoneNo = 832212;
        long longNo = 134541319;
        float floatNo = 1.11f;
        double doubleNo = -265691.15;
       

        alive = false;
        age = 19;
        iniName = 'T';
        height = 157;
        phoneNo = 832202;
        longNo = 5481024;
        floatNo = 2.22f;
        doubleNo = 982.365;

        System.out.println("All variables' names & values are: ");
        System.out.println("alive = " + alive);
        System.out.println("iniName = " + iniName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("phoneNo = " + phoneNo);
        System.out.println("longNo = " + longNo);
        System.out.println("floatNo = " + floatNo);
        System.out.println("doubleNo = " + doubleNo);
       
    }
}