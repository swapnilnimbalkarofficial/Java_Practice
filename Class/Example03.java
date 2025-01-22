public class Example03 {
    int findmaxdigit(int n) {
        int max = 0;
        while (max != 0)
            if (max < n % 10)
                max = n % 10;
        n /= 10;
        return max;
    }
}
