package fraction.utils;

public class NumberUtils {

    public static int GCD (int a, int b) {
        if (a < 0) a = -1 * a;
        if (b < 0) a = -1 * b;
        if (a == 0) return b;
        if (b == 0) return a;
        if ( b < a ) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return GCD (b-a, a);
    }
}
