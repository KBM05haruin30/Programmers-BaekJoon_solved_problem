

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sacn = new Scanner(System.in);

    static int N, M, T;
    static int[] A, B;

    static void input() {
        N = sacn.nextInt();
        M = sacn.nextInt();
        A = new int[N + 1];
        B = new int[M + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sacn.nextInt();
        }
        for (int i = 1; i <= M; i++) {
            B[i] = sacn.nextInt();
        }
    }

    static int lower_bound(int[] A, int L, int R, int X) {
        // A[L...R] 에서 X 미만의 수(X 보다 작은 수) 중 제일 오른쪽 인덱스를 return하는 함수
        // 그런 게 없다면 L - 1 을 return 한다.
        int result = L - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] < X) {
                result = mid;
                L = mid + 1;
            } else if (A[mid] >= X) {
                R = mid - 1;
            }
        }
        return result;
    }

    static void pro() {
        // B 배열에 대해 이분탐색을 할 예정이니까, 정렬을 해주자!
        Arrays.sort(B, 1, M + 1);

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            // A[i]를 선택했을 때, B에서는 A[i]보다 작은 게 몇 개나 있는 지 count하기
            ans += lower_bound(B, 1, M, A[i]);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        T = sacn.nextInt();
        for (int i = 0; i < T; i++) {
            input();
            pro();
        }
    }
}
