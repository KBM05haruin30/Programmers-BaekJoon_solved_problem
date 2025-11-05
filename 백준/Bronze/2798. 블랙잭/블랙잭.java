import java.util.Scanner;

public class Main {
    static int N, M, max;
    static int[] cards;
    static int[] selected;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        cards = new int[N];
        selected = new int[3];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        max = 0;
    }

    static void rec_func(int depth, int start) {
        if (depth == 3) {
            int sum = selected[0] + selected[1] + selected[2];
            if (sum <= M && sum > max) {
                max = sum;
            }
            return;
        }
        
        for (int i = start; i < N; i++) {
            selected[depth] = cards[i];
            rec_func(depth+1, i + 1);
        }
        
    }

    public static void main(String[] args) {
        input();
        rec_func(0,0);
        System.out.println(max);
    }
}