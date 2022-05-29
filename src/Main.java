import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
    }
}