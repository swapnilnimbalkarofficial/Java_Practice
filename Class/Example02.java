public class Example02 {
    int findfirstdigit(int n) {
        while (n > 9)
            n /= 10;
        return n;
    }
}
