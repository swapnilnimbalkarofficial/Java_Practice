import java.util.*;

public class MinusMain {
    public static void main(String[] args) {
        Minus mn = new Minus();
        Scanner scan = new Scanner(System.in);
        mn.a = 10;
        mn.b = 30;
        int ans = mn.minus();
        System.out.println(ans);
    }
}
