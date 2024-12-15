

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    static int N, M;
    static int[] A, B;

    static void input() {
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        M = sc.nextInt();
        B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
    }

    // 이분 탐색 함수
    static boolean binarySearch(int[] array, int key) {
        int L = 0, R = array.length - 1;
        while(L <= R) {
            int mid = (L + R) / 2;
            if (key > array[mid]) {
                L = mid + 1;
            } else if (key < array[mid]) {
                R = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    static void pro() {
        // A 배열 정렬
        Arrays.sort(A);

        // 이분 탐색으로 구하기
        for (int i = 0; i < M; i++) {
            if (binarySearch(A, B[i])) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(sb.toString());
    }

}
