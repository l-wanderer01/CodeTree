import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        boolean flag = true;
        while (flag) {
            for (int i = 0; i < A.length(); i++) {
            // i = 시작 idx
                if (A.charAt(i) == B.charAt(0)) {
                    int idx = i;
                    for (int j = 1; j < B.length(); j++) {
                        if (A.charAt(i + j) != B.charAt(j) || i + j >= A.length()) {
                            break;
                        }
                        else {
                            idx++;
                        }
                    }
                    if (idx - i == B.length()) {
                        A = A.substring(0, i) + A.substring(idx);
                        break;
                    }
                }
                if (i == A.length() - 1) flag = false;
            }
        }

        System.out.printf("%s", A);
    }
}