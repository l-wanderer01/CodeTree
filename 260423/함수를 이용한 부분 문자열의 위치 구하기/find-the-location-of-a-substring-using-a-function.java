import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        String M = sc.nextLine();

        sc.close();

        int res = isSubstring(N, M);

        System.out.printf("%d", res);
    }

    private static int isSubstring(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        int idx = -1;
        for (int i = 0; i <= a_len-b_len; i++) {
            String tmp = a.substring(i, i+b_len);
            if (tmp.equals(b)) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}