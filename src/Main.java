import java.util.Scanner;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {

        System.out.print("Введите булевы значения: ");
        Scanner in = new Scanner(System.in);
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