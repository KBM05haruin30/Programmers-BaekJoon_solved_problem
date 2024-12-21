

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] A, B;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
    }

    static boolean binarySearch(int[] arr, int target) {
        int L = 0, R = N - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                L = mid + 1;
            } else {
                R = mid -1;
            }
        }
        return false;
    }

    static void pro() {
        // A 배열에 대해 이분 탐색
        Arrays.sort(A);

        // B 배열의 값을 A 배열에 비교
        for (int i = 0; i < M; i++) {
            if (binarySearch(A, B[i])) {
                sb.append(1).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
}
