import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        boolean res = Main.isPalindrome(text);
        System.out.println(res);
    }
    public static boolean isPalindrome(String text) {
        String newString = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb_newString = new StringBuilder(newString);
        boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
        return fin;
    }
}