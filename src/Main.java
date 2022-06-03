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
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {

        System.out.print("Введите булевы значения: ");
        Scanner in = new Scanner(System.in);

        boolean a = Boolean.parseBoolean(in.nextLine());
        boolean b = Boolean.parseBoolean(in.nextLine());
        boolean c = Boolean.parseBoolean(in.nextLine());
        boolean d = Boolean.parseBoolean(in.nextLine());
        boolean res = Main.booleanExpression(a, b, c, d);
        System.out.println(res);
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b)&(c ^  d) || (a ^  c) & (b ^  d);
    }
}
        int year = Integer.parseInt(in.nextLine());
        int res  = Main.leapYearCount(year);
        System.out.println(res);
    }
    public static int leapYearCount(int year) {
        return year/4 - year/100 + year/400;
        Scanner in = new Scanner(System.in);
        int value = Integer.parseInt(in.nextLine());
        BigInteger res = Main.factorial(value);
        System.out.println(res);
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
