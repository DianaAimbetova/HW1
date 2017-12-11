import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        String one = args[0];
        String two = args[1];
        int a = Integer.parseInt(one);
        int b = Integer.parseInt(two);
        Sum sum = new Sum(a,b);
        System.out.println("Summa: ");
        System.out.println(sum.calc());
    }
}
