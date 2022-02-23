package staticdemo;

public class Car extends DriveCar {//if this class is final it wont be possible to be extended in tesla class
    private String color; //nonstatic
    private static int counter; //static variable
    private static String engineType;
    public final static boolean FOUR_WHEEL_DRIVE;//constant can be public;final static means constant
    private final String brandName;//nonstatic
    //private final String brandName = "Toyota"

    static {
        System.out.println("initializing engine type");
        engineType = "Gasoline";
        FOUR_WHEEL_DRIVE = true;
    }

    public static int getCounter() {
        //color = "red" // static method cannot use nonstatic methods
        return counter;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty())
            this.color = color;
       // }else{
        System.out.println("Invalid entry for color");
    }

    public Car(String color, String brandName){
        setColor(color);
        this.brandName = brandName;
        counter++;
    }

    public void printCarDetails(){
        System.out.println("Car details:");
        System.out.println("Car color" +this.color);
        System.out.println("Car brand" +this.brandName);
        System.out.println("Car engine type" +this.engineType);
        System.out.println("Car four wheel drive" +this.FOUR_WHEEL_DRIVE);
    }

    @Override
    public void driveForward(String carIdentifier) {
        System.out.println(this + "is going forward");
    }

    @Override
    public String driveBackward(String carIdentifier) {
        String result = this + " is going forward";
        System.out.println(result);
        return result;

    }
}
