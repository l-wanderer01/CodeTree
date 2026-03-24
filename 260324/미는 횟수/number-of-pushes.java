import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int len = A.length();
        int idx = 0;

        while (true) {
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (A.charAt(i) == B.charAt((idx+i)%len)) {
                    cnt++;
                }
            }
            if (cnt == len) break;
            else idx++;
        }
    }
}