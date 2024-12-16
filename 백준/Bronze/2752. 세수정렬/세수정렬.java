

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
        A = new int[3];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        // 정렬
        Arrays.sort(A);
        // 정렬 후 차례대로 출력
        for (int i = 0; i < 3; i++) {
            sb.append(A[i]).append(' ');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
}
