import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        int num = (int) Math.pow(N, 2);

        for (int i = 0; i < N; i++) {
            int tmp = num, dict = 0;;

            if (i % 2 == 0 && N % 2 == 0 || i % 2 != 0 && N % 2 != 0) {
                tmp = i % 2 != 0 && N % 2 != 0 ? num - 4: num - 3;
                dict = 1;
            }
            else {
                tmp = num;
                dict = -1;
            }
            for (int j = 0; j < N; j++) {
                arr[i][j] = tmp + dict * j;
            }
            num -= N;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", arr[j][i]);
            }
            System.out.println();
        }
    }
}