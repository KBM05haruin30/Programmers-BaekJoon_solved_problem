import java.util.Scanner;

public class Main{
    static int A, B, sum;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        sum = A + B;
        System.out.print(sum);
    }
}