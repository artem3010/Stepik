import java.util.Scanner;

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
