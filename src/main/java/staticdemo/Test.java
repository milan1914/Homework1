package staticdemo;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("red", "Ferrari");
       // car1.color = "red"; //nonstatic variable accessible using the object
        //car1.counter = 4; //accessing static variable using the objects of the clas

        Car car2 = new Car("blue", "Porche");
        Car car3 = new Car("pink", "BMW");
        car1.setColor("yellow");


       // car2.color = "blue"; //nonstatic variable accessible using the object
       // car2.counter = 1; //accessing static variable using the objects of the clas
        //car1.

//        System.out.println(car2.counter);
//        System.out.println(car1.counter);
//        System.out.println(Car.counter);
        if(Car.FOUR_WHEEL_DRIVE){
            System.out.println("4 wheel drive car");
        }else {
            System.out.println("2 wheel drive car");
        }
        System.out.println("All cars manufactured so far are: " + Car.getCounter());

        car2.printCarDetails();
        System.out.println("-----------");
        Tesla modelS = new Tesla("red","Tesla", "50KW");
        modelS.printCarDetails();

//        car3.driveForward();
//        car2.driveBackward();
    }
}
