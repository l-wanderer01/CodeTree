import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        String[] arr = input.split(" ");

        int idx = arr.length - 1;
        
        if (arr[idx].equals("0")) idx -= 1;

        for (int i = idx; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}