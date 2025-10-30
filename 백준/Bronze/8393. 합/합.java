import java.util.Scanner;

public class Main {
    
    static int n, sum;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    
    static void sum_all(int n) {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
    
    public static void main(String[] args) {
        input();
        sum_all(n);
        
    }
}