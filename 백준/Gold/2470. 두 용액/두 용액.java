

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    static int N;
    static int[] A;

    static void input() {
        N = sc.nextInt();
        A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
    }

    static void pro() {
        // A에 대해 이분 탐색을 할 예정이니까, 정렬을 미리 해주자
        Arrays.sort(A, 1, N + 1);

        int best_sum = Integer.MAX_VALUE;
        int v1 = 0, v2 = 0, L = 1, R = N;

        while(L < R) { // L==R 인 상황이면 용액이 한 개 뿐인 것이므로, L < R 일 때까지만 반복
            /* TODO */
            int sum = A[L] + A[R];
            if (Math.abs(sum) < best_sum) {
                best_sum = Math.abs(sum);
                v1 = A[L];
                v2 = A[R];
            }

            if (sum > 0) {
                R--;
            } else {
                L++;
            }
        }
        sb.append(v1).append(' ').append(v2);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        input();
        pro();
    }

}
