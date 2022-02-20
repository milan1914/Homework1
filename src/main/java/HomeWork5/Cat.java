package HomeWork5;

public class Cat extends Pet{
    private Breed breed;

    public Cat(boolean hasTail, String name, int age, Breed breed, Address address) {
        super(hasTail, name, age, breed, address);
    }
    public Cat(){
        super(true, "", 0, new Breed(""), null);
    }

    public void meow(){
        System.out.println("Meow Meow Meow");
    }


}




