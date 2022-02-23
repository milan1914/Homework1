public class mathdemo {
    public static void main(String[] args) {

    }

    public static int findTriangleAreaByTwoSidesAndAngle(int a, int b, double angle){
        return (int) Math.pow(0.5 * a * b * Math.sin(Math.toRadians(angle)),2);
    }
}
