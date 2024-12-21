

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, sum, ans;
    static int[] nums;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        nums = new int[N+1];
        for (int i = 1; i <= N; i++) {
            nums[i] = i;
        }
    }

    static void pro() {
        int R = 0, sum = 0, ans = 0;
        for (int L = 1; L <= N; L++) {
            sum -= nums[L-1];
            while(R + 1 <= N && sum < N) {
                R++;
                sum += nums[R];
            }
            if (sum == N) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
