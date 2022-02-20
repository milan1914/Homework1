package HomeWork5;

public class Test {
    public static void main(String[] args) {
        Cat persian = new Cat();
        Address catAddress = new Address();
        catAddress.setCity("Sofia");
        catAddress.setStreetName("Todorini kukli Str");
        catAddress.setPostalCode("1000");
        persian.printData();


        persian.setAge(5);
        Breed perCat = new Breed("Persian Cat");
        persian.setBreed(new Breed("Persian Cat"));
        persian.setBreed(perCat);
        persian.setHasTail(true);
        persian.setName("Tiger");
        persian.setAddress(catAddress);
        persian.printData();

    }
}
