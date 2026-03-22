import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        ArrayList<String> al = new ArrayList<>();

        while (true) {
            String str = sc.nextLine();
            if (str.equals("0")) break;
            else {
                cnt++;
                al.add(str);
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < al.size(); i+=2) {
            System.out.println(al.get(i));
        }
    }
}