import java.util.Scanner;

public class Main {
    
    static int N;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }
    
    static void gugudan(int n) {
        for (int i = 1; i <= 9; i++) {
            int mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }
    
    public static void main(String[] args) {
        input();
        gugudan(N);
    }
}