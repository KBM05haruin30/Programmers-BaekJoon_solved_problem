

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] A;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        // 오름차순으로 정렬
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            sb.append(A[i]).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
