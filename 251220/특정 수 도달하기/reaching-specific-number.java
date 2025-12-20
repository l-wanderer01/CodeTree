import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, cnt = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 250) break;
            else {
                sum += num;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;
        System.out.println(sum + " " + avg);
    }
}