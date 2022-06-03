import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String res = Main.printTextPerRole(roles, textLines);
    }
    public static  String printTextPerRole(String[] roles, String[] textLines) {
        for (int i = 0; i < roles.length; i++) {
            System.out.println(roles[i]+":");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    System.out.println((j + 1) + ")" + textLines[j].substring(roles[i].length() + 1));
                }
            }
            System.out.print("\n");
        }
        return "";
        int[] a1 =  {0, 2, 2};
        int[] a2 =  {1, 3};
        int[] a3 =  Main.mergeArrays(a1, a2);
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ? a1[pos1++] : a2[pos2++]);
            System.out.println(result[pos1+pos2]);
        }
        return result;
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
        int a = Integer.parseInt(in.nextLine());
        char res = Main.charExpression(a);
        System.out.println(res);

    }
    public static char charExpression(int a) {
        int ch = '\\';
        int x = ch + a;

        return (char)x;
        int value = Integer.parseInt(in.nextLine());
        int bitIndex = Integer.parseInt(in.nextLine());
        int res = Main.flipBit(value, bitIndex);
        System.out.println(res);
    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1);

        double a = Double.parseDouble(in.nextLine());
        double b = Double.parseDouble(in.nextLine());
        double c = Double.parseDouble(in.nextLine());
        boolean res  = Main.doubleExpression(a, b, c);
        System.out.println(res);
    }
    public static boolean doubleExpression(double a, double b, double c) {
        boolean d;
        d=Math.abs (a+b-c)<0.001;
        return d;
import java.math.BigInteger;
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
