import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
public class Main {
    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        System.out.println();
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double I = 0;
        while (a < b) {
            I += f.applyAsDouble(a += 1e-6);
        }
        return I*1e-6;
    }
}

