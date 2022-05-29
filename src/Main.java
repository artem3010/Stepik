import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        char res = Main.charExpression(a);
        System.out.println(res);
    }
    public static char charExpression(int a) {
        int ch = '\\';
        int x = ch + a;

        return (char)x;
    }
}