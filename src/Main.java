import java.util.Scanner;

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
    }
}