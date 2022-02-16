package encapsulation;

public class Product {
    private String name;
    private double cost;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("Invalid product name entry!");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
            if(cost > 0){
                this.cost = cost;
            }else {
                System.out.println("Invalid entry for money");
        }
        this.cost = cost;
    }

    public Product (String name, double cost){
        setName(name);
        setCost(cost);
        }
    }

}

