package data.types;

public class Dog {
    public String name;
    public byte age;
    public static String breed;

    public String getBreed(){
        return breed;



    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public void barf(){
        //local variable
        String dogAction = "bau bau";

        System.out.println("The dog named: ");

    }
}
