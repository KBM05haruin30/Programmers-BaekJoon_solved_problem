import java.util.Scanner;

public class Main {
    
    static int A, B, sub;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        sub = A - B;
        System.out.print(sub);
        
    }
}