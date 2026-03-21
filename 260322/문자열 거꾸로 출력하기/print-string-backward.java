import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            String s = sc.nextLine();
            if (s.equals("END")) break;
            else {
                String str = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                    str += s.charAt(i) + "";
                }
                System.out.printf("%s\n", str);
            }
        }
        while(true);
    }
}