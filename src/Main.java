import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean isExit = false;
        while (!isExit) {
            System.out.println(sqrt(new Scanner(System.in).nextDouble()));
            isExit = new Scanner(System.in).toString().equals("close");
        }



    }
    public static double sqrt(double x) {
        if (x >= 0){
            return Math.sqrt(x);
        } throw new java.lang.IllegalArgumentException ("Expected non-negative number, got "+ x);
    }
}