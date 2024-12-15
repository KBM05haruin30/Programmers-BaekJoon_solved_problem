

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int N;
    static int[] P;

    static void input() {
        N = sc.nextInt();
        P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
    }

    static void pro() {
        // P 배열 정렬
        Arrays.sort(P);

        // 인출하는 데 걸리는 시간 더하기
        long withdraw = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            withdraw = P[i] + withdraw;
            ans += withdraw;
        }
        System.out.println(ans);
        // 1 2 3 3 4
        // P[0] => withdraw = 0 + 1 = 1
        // P[1] => withdraw = 1 + 2 = 3, 1 + 2 = 3
        // P[2] => withdraw = 3 + 3 = 6, 1 + 2 + 3 = 6
        // P[3] => withdraw = 6 + 3 = 9, 1 + 2 + 3 + 3 = 9
        // P[4] => withdraw = 9 + 4 = 13, 1 + 2 + 3 + 3 + 4 = 13
    }

    public static void main(String[] args) {
        input();
        pro();
    }

}
