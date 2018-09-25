public class ProblemSet1_5 {
    public static void main(String[] args) {
        final int a = 1;
        final int b = 6;
        final int c = -16;

        double x1 = (-b + Math.sqrt((b*b)-4*(a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b)-4*(a*c)))/(2*a);

        double answer1 = (x1*x1)+(6*x1)-c;
        double answer2 = (x2*x2)+(6*x2)-c;

        System.out.println(answer1);
    }
}
