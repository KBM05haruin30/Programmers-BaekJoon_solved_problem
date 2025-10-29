import java.util.Scanner;

public class Main{
    
    static int A, B, C;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }
    static void cal(int a, int b, int c) {
        int c_h = c / 60;
        int c_m = c % 60;
        if ((b + c_m) >= 60) {
            a = a +1;
            b = b + c_m - 60;
        } else {
            b = b + c_m;
        }
        if ((a + c_h) >= 24) {
            a = a + c_h - 24;
        } else {
            a = a + c_h;
        }
        System.out.print(a + " " + b);
    }
    
    public static void main(String[] args) {
        input();
        cal(A, B, C);
    }
}