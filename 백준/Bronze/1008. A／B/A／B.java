import java.util.Scanner;

public class Main{
    static int A, B;
    static double div;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    
    public static void main(String[] args) {
        input();
        div = A / (double)B;
        System.out.print(div);
    }
}