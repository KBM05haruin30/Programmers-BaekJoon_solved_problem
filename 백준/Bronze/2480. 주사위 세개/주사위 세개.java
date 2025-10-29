import static java.lang.Math.max;
import java.util.Scanner;

public class Main {
    static int a, b, c, reward;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    
    static int rewards(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return 10000 + a * 1000;
        } else if ((a == b) && (a != c)) {
            return 1000 + a * 100;
        } else if((a == c) && (a != b)) {
            return 1000 + a * 100;
        } else if ((b == c) && (a != b)) {
            return 1000 + b * 100;
        } else{
            return max(max(a, b), c) * 100;
        }
    }
    
    
    public static void main(String[] args) {
        input();
        reward = rewards(a, b, c);
        System.out.print(reward);
    }
}