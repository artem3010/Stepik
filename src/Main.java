import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = Integer.parseInt(in.nextLine());
        int bitIndex = Integer.parseInt(in.nextLine());
        int res = Main.flipBit(value, bitIndex);
        System.out.println(res);
    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1);
    }
}