public class MakeNegative {
    public static int makeNegative(final int x) {
        boolean isNegative = x <= 0;
        if (isNegative) {
            return x;
        }
        return -(x);
    }
}
