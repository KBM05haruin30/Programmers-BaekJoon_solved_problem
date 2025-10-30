import java.util.Scanner;

public class Main {
    
    static int T, A, B;
    static Scanner sc = new Scanner(System.in);
    
    static void input_case() {
        T = sc.nextInt();
    }
    
    static void input_AB() {
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input_case();
        for (int i = 0; i < T; i++) {
            input_AB();
            System.out.println(A+B);
        }
    }
}