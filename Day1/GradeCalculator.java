public class GradeCalculator {

    public static void main(String[] args) {
        int totalStudents=90;
        int boys=45;
        int boysA=20;

        double totalA=totalStudents*0.5;
        int girlsA=(int)totalA-boysA;
        System.out.println("Total girls who secured grade A:"+girlsA);
    }
}