import java.util.Scanner;

public class Main{
    static int A, B, sum, sub, mul, div, rest;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        sum = A + B;
        sub = A - B;
        mul = A * B;
        div = A / B;
        rest = A % B;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rest);
    }
}