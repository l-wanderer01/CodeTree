import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = sc.nextInt(), cnt = 0;

        for (int i = 0; i < N - 1; i++) {
            int num = sc.nextInt();
            if (min > num) {
                cnt = 0;
                min = num;
            }
            if (min == num) cnt++;
        }

        System.out.printf("%d %d", min, cnt);
    }
}