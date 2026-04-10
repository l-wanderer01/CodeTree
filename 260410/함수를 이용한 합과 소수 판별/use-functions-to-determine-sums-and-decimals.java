import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = 0;

        for (int i = A; i <= B; i++) {
            if(isPrimeEven(i)) res++;
        }

        System.out.printf("%d", res);
    }

    private static boolean isPrimeEven(int n) {
        if(((n / 10) + (n % 10)) % 2 == 0) {
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
}