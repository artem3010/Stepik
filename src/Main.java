import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
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