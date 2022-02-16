package encapsulation;

public class Test {
    public static void main(String[] args) {
        Person elena = new Person("Elena",11.0);
        Person alex = new Person("Alex",4.0);

        Product coffee = new Product("Coffee",10.0);
        Product tea = new Product("Tea",2.0);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);

        elena.printItemsPerUser();
        alex.printIme
    }
}
