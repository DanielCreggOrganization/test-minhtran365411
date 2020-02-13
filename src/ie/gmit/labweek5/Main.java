package ie.gmit.labweek5;

public class Main {
    public static void main(String[] args) {
        Puppy puppyObject1 = new Puppy();
        Puppy puppyObject2 = new Puppy("Bingo");
        Puppy puppyObject3 = new Puppy("Rex", 10, "Corgi");


        System.out.println(puppyObject1.name + " is " + puppyObject1.age + " and is a " + puppyObject1.breed);
        System.out.println(puppyObject2.name + " is " + puppyObject2.age + " and is a " + puppyObject2.breed);
        System.out.println(puppyObject3.name + " is " + puppyObject3.age + " and is a " + puppyObject3.breed);

        // Human humanObject1 = new Human();
        // Human humanObject2 = new Human();
        // Human humanObject3 = new Human();
        // Human humanObject4 = new Human();

        // humanObject1.name = "Minh";
        // humanObject1.age = 20;
        // humanObject1.nationality = "Vietnamese";
        // humanObject1.weight = 54.6f;

        // System.out.println(humanObject1.name + " is " + humanObject1.age + " and is a " + humanObject1.nationality);
        // humanObject1.sayHello();
        // System.out.println( humanObject1.eating(0.5f) ); 
        // humanObject1.ageGroup();

        // humanObject2.name = "David";
        // humanObject2.age = 28;
        // humanObject2.nationality = "Irish";

        // System.out.println(humanObject2.name + " is " + humanObject2.age + " and is an " + humanObject2.nationality);
        // System.out.println( humanObject2.yearsGoneBy() );
        // humanObject2.ageGroup();

        // humanObject3.name = "Louise";
        // humanObject3.age = 21;
        // humanObject3.nationality = "Frech";

        // System.out.println(humanObject3.name + " is " + humanObject3.age + " and is a " + humanObject3.nationality);
        // humanObject3.sayHello();
        // humanObject3.ageGroup();

        // humanObject4.name = "John";
        // humanObject4.age = 80;
        // System.out.println(humanObject4.name + " is " + humanObject4.age + " and is a " + humanObject4.nationality);
        // humanObject4.ageGroup();
    }
}