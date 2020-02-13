package ie.gmit.labweek5;

public class Puppy {
    String name;
    int age;
    String breed;
    String color;

    //Default Constructor
    Puppy() {

    }

    Puppy(String newName) {
        name = newName;
    }

    Puppy(String newName, int newAge, String newBreed) {
        name = newName;
        age = newAge;
        breed = newBreed;
    }
}