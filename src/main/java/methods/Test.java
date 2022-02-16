package methods;

public class Test {
    public static void main(String[] args) {
        Student ivo = new Student();
        ivo.setFaculty("KST");
        ivo.setFacultyNumber(12345);

        System.out.println(ivo.getFaculty());
        System.out.println(ivo.getFacultyNumber());

        System.out.println(ivo.takeExam(true));

        if (ivo.getNumberOfSubjects()>5){
            System.out.println("You have no free time");
        }else {
            System.out.println("You can sign up for some mre subjects");
        }
    }
}
