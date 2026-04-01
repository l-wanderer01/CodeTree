import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (i % 3 == 0) {
                cnt++;
            }
            else {
                int num = third(i);
                if (num == -1) cnt++;
            }
        }

        System.out.printf("%d", cnt);
    }

    private static int third(int n) {
        if (n < 3) return n;
        int div = n % 10;
        if (div % 3 == 0 && div > 0) return -1;
        return third(n / 10);
    }
}