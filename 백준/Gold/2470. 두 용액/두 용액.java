
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

    static int lower_bound(int[] A, int L, int R, int X) {
        // A[L...R] 에서 X 이상의 수 중 제일 왼쪽 인덱스를 return하는 함수
        // 그런 게 없다면 R + 1을 return 한다
        int res = R + 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] >= X) {
                res = mid;
                R = mid -1;
            } else {
                L = mid + 1;
            }
        }
        return res;
    }

    static void pro() {
        // A 에 대해 이분 탐색을 할 예정이니까, 정렬을 미리 해주자.
        Arrays.sort(A, 1, N + 1);

        int best_sum = Integer.MAX_VALUE;
        int v1 = 0, v2 = 0;
        for (int left = 1; left <= N; left++) {
            // A[left] 용액을 쓸 것이다. 고로 -A[left] 와 가장 가까운 용액을 자신의 오른쪽 구간에서 찾자.
            int res = lower_bound(A, left+1, N, -A[left]);

            // A[res - 1]와 A[res] 중에 A[left] 와 섞였을 때의 정보를 정답에 갱신시킨다.
            if (left + 1 <= res - 1 && res - 1 <= N && Math.abs(A[res-1] + A[left]) < best_sum) {
                best_sum = Math.abs(A[res-1] + A[left]);
                v1 = A[left];
                v2 = A[res - 1];
            }

            if (left + 1 <= res && res <= N && Math.abs(A[res] + A[left]) < best_sum) {
                best_sum = Math.abs(A[res] + A[left]);
                v1 = A[left];
                v2 = A[res];
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
