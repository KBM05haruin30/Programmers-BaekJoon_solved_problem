import java.util.Scanner;

public class Main{
    
    static int A, B;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    static void cmp(int a, int b) {
        if (a > b) {
            System.out.print(">");
        } else if (a < b) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
    
    public static void main(String[] args) {
        input();
        cmp(A, B);
    }
}