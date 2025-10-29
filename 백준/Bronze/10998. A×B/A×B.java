import java.util.Scanner;

public class Main{
    
    static int A, B, mul;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        mul = A * B;
        System.out.print(mul);
    } 
}