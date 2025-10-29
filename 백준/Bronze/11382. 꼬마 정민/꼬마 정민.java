import java.util.Scanner;

public class Main{
    
    static long A, B, C;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();
    }
    
    public static void main(String[] args) {
        input();
        System.out.print(A + B + C);
    }
    
}