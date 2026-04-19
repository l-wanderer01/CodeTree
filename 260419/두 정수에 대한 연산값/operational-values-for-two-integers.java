import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] res = {sc.nextInt(), sc.nextInt()};

        res = modified(res);

        System.out.printf("%d %d", res[0], res[1]);
    }

    private static int[] modified(int[] arr) {
        if (arr[0] > arr[1]) {
            arr[0] += 25;
            arr[1] *= 2;
        }
        else {
            arr[0] *= 2;
            arr[1] += 25;
        }
        return arr;
    }
}