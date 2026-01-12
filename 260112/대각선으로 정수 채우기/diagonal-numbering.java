import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int num = 1, count = 0; // count: 현재 행과 열의 합

        int[][] arr = new int[N][M];
        
        while(count <= N + M - 2) {
            int row = count - M > 0 ? count - M : 0;
            int col = count - M > 0 ? count - row - 1 : count - row;
            while(row >= 0 && col >= 0 && row < N && col < M){
                arr[row++][col--] = num++;
            }
            count++;
        }
        
        arr[N - 1][M - 1] = num;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }        
    }
}