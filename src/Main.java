import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = Double.parseDouble(in.nextLine());
        double b = Double.parseDouble(in.nextLine());
        double c = Double.parseDouble(in.nextLine());
        boolean res  = Main.doubleExpression(a, b, c);
        System.out.println(res);
    }
    public static boolean doubleExpression(double a, double b, double c) {
        boolean d;
        d=Math.abs (a+b-c)<0.001;
        return d;
    }
}