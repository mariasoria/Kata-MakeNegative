public class MakeNegative {
    public static int makeNegative(final int x) {
        int negativeNumb = 0;
        if (x > 0) {
            negativeNumb = -(x);
            return negativeNumb;
        } else {
            return x;
        }
    }
}
