package ie.gmit.labweek5;

public class Human {
    String name;
    int age;
    String nationality;
    float weight;


    void sayHello() {
        System.out.println("Hi there!");
    }

    int yearsGoneBy() {
        age++;
        return age;
    }

    float eating(float food) {
        weight += food;
        return weight;
    }

    void ageGroup() {
        if (age <= 20) {
            System.out.println("This person is a teenager.");
        } else if ( (age > 20) && (age <28) ) {
            System.out.println("This person is a young adult.");
        } else if ( (age >=28) && (age < 60) ) {
            System.out.println("This person is in middle-age.");
        } else {
            System.out.println("This person is an elderly.");
        }
    }

}