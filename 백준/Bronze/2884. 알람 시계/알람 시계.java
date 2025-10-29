import java.util.Scanner;

public class Main {
    
    static int H, M;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
    }
    
    static void cal(int H, int M) {
        if ((M - 45) < 0) {
            H = H - 1;
            M = M - 45 + 60;
        } else {
            M = M - 45;
        }
        if (H < 0) {
            H = H + 24;
        }
        System.out.print(H + " " + M);
    }
    
    public static void main(String[] args) {
        input();
        cal(H, M);
        
    }
}