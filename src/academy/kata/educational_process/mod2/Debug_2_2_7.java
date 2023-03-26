package academy.kata.educational_process.mod2;

public class Debug_2_2_7 {
    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println(minFromFour);
    }

    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        int secondPairResult = getMinFromTwo(d, c);

        return getMinFromTwo(firstPairResult, secondPairResult);
    }

    public static int getMinFromTwo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
