import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int len = A.length();
        int idx = 1;
        int loop = 0; // 끝까지 돌았는지 어떻게 확인..?

        while (idx < (len + 1)) {
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (B.charAt(i) == A.charAt((idx+i)%len)) {
                    cnt++;
                }
            }
            if (cnt == len) break;
            else idx++;
        }
        if (idx > len) idx = -1;
        System.out.printf("%d", idx);
    }
}