package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private double money;
    private LinkedList<Product>bagOdProducts = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("Invalid person name entry!");
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money > 0){
            this.money = money;
        }else {
            System.out.println("Invalid entry for money");
        }

    }

    public LinkedList<Product> getBagOdProducts() {
        return bagOdProducts;
    }

    public Person(String name, double money){
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if(this.getMoney() >= product.getCost()){
            this.bagOdProducts.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.printf("\"%s bough %s\"\n", this.getName(), product.getName());
        }else {
            System.out.printf("\"%s can`t afford %s\"\n", this.getName(), product.getName());
        }
    }
    public void printItemsPerUser(){
        if(bagOdProducts.size() == 0){
            System.out.printf("\"\\\"%s Nothing both %s\\\"\\n\", this.getName()");
        }

        String itemNames = "";
        for (Product product : bagOdProducts){
            if (bagOdProducts.size() > 1){
                itemNames += product.getName() + ", ";
            }else {
                itemNames += product.getName();
            }
        }
    }
}
