

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N, M, sum, cnt;
    static int[] A;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        int R = 0, sum = 0, cnt = 0;
        for (int L = 1; L <= N; L++) {
            sum -= A[L-1];
            while(R + 1 <= N && sum < M) {
                R++;
                sum += A[R];
            }
            if (sum == M) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }


    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
