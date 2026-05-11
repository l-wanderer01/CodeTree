import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        down(N);
        up(N);
    }

    private static void down(int N) {
        if (N == 0) return;
        System.out.printf("%d ", N);
        down(N - 1);
    }

    private static void up(int N) {
        if (N == 0) return;
        up(N - 1);
        System.out.printf("%d ", N);
    }
}