import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = Integer.parseInt(in.nextLine());
        boolean res = Main.isPowerOfTwo(value);
        System.out.println(res);
    }
    public static boolean isPowerOfTwo(int value) {
        int a = Math.abs(value);
        Integer b = Integer.bitCount(a);
        return b == 1 ? true : false;
    }
}
