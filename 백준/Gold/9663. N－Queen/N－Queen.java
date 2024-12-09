

import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    static void input() {
        N = sc.nextInt();
        col = new int[N + 1];
    }

    static int N, ans;
    static int[] col;

    static boolean attackable(int r1, int c1, int r2, int c2) {
        // 같은 열에 있으면
        if (c1 == c2) return true;
        // 대각선에 있는지(행 - 열 값이 같은 것들은 오른쪽 아래로 대각선이 같은 위치에 있다)
        if (r1 - c1 == r2 - c2) return true;
        // 대각선에 있는지(행 + 열 값이 같은 것들은 오른쪽 위로 대각선이 같은 위치에 있다)
        if (r1 + c1 == r2 + c2) return true;
        return false;
    }

    static boolean validaity_check() {
        for (int i = 1; i <= N; i++) {
            // (i, col[i])
            for (int j = 1; j < i; j++) {
                // (j, col[j])
                if (attackable(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }


    static void rec_func(int row) {
        if (row == N + 1) { // 1 ~ N 번 행에 대해서 성공적으로 놓았다!
            ans++;
        } else {
            for (int c = 1; c <= N; c++) {
                boolean possible = true;
                // valid check (row, c)
                for (int i = 1; i <= row - 1; i++) {
                    // (i, col[i])
                    if (attackable(row, c, i, col[i])) {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    col[row] = c;
                    rec_func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(ans);
    }
}
