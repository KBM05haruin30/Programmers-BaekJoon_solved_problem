import java.util.Scanner;

public class Main {
    
    static int x, y, quadrant;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }
    
    static int quadrants(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x < 0 && y > 0) {
            return 2;
        } else {
            return 3;
        }
    }
    
    public static void main(String[] args) {
        input();
        quadrant = quadrants(x, y);
        System.out.print(quadrant);
    }
}