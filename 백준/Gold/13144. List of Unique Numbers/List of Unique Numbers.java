

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    static int N;
    static int[] A, cnt;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        cnt = new int[100000 + 1];
    }

    static void pro() {
        long ans = 0;

        for (int L = 1, R = 0; L <= N; L++) { // L 마다 R을 최대한 옮겨 줄 계획이다.
            // R을 옮길 수 있는 만큼 옮긴다.
            /* TODO */
            while (R + 1 <= N && cnt[A[R + 1]] == 0) {
                R++;
                cnt[A[R]]++;
            }

            // 정답을 갱신한다.
            /* TODO */
            ans += R - L + 1;

            // L을 옮겨주면서 A[L]의 개수를 감소시킨다.
            /* TODO */
            cnt[A[L]]--;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
