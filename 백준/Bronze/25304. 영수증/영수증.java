import java.util.Scanner;

public class Main {
    
    static int X, N, a, b, sum;
    
    static Scanner sc = new Scanner(System.in);
    
    static void input_receipt() {
        X = sc.nextInt();
        N = sc.nextInt();
    }
    
    static void input_item(int n) {
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a * b;
        }
    }
    
    static void true_or_false(int X, int sum) {
        if (X == sum) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    
    public static void main (String[] args) {
        input_receipt();
        input_item(N);
        true_or_false(X, sum);
    }
}