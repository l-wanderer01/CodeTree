import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int A_idx = A.length();
        int B_idx = B.length();

        for (int i = 0; i < A.length(); i++) {
            char tmp = A.charAt(i);
            if (!Character.isDigit(tmp)) {
                A_idx = i;
                break;
            }
        }
        for (int i = 0; i < B.length(); i++) {
            char tmp = B.charAt(i);
            if (!Character.isDigit(tmp)) {
                B_idx = i;
                break;
            }
        }

        String A_num = A.substring(0, A_idx);
        String B_num = B.substring(0, B_idx);

        int sum = Integer.parseInt(A_num) + Integer.parseInt(B_num);
        System.out.printf("%d", sum);
    }
}