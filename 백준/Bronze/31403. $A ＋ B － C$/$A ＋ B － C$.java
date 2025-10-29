import java.util.Scanner;

public class Main{
    
    static int A, B, C;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }
    
    static void num_cal(int A, int B, int C) {
        int number = A + B - C;
        System.out.println(number);
    }
    
    static void str_cal(int A, int B, int C) {
        String first = "" + A + B;
        System.out.print(Integer.valueOf(first) - C);
    }
    
    public static void main(String[] args) {
        input();
        num_cal(A, B, C);
        str_cal(A, B, C);
    }
}