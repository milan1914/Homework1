package staticdemo;

public class Tesla extends Car {
    private String batteryCapacity;
    private static final boolean AUTOPILOT = true;

    public Tesla(String color, String brandName, String batteryCapacity) {
        super(color, brandName);
        this.batteryCapacity = batteryCapacity;
    }

//    @Override
//    public void printCarDetails() {
//        super.printCarDetails();
//        System.out.println("Battery capacity"+batteryCapacity);
//        System.out.println("Autopilot"+AUTOPILOT);
    }

