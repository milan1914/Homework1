package data.types;

public class Variables {
    public static void main(String[] args) {
        //some of the primitive types
        byte age = 120;
        char someRandomChar = 'd';

        //Referent types
        String someRandomString = "Random String";
        Dog myDog = new Dog();
        myDog.name = "Barry";
        myDog.age = 7;
        myDog.setBreed("Golden Retriever");

        System.out.println("My dog name is: " + myDog.name);
        System.out.println("My dog age is: " + myDog.age);

        myDog.age = 5;
        System.out.println("My dog age is: " + myDog.age);

        Dog myDog2 = new Dog();
        myDog2.name = "Rexi";
        myDog2.age = 6;
        myDog2.setBreed("German Shepard");

        System.out.println("first");





    }
}
