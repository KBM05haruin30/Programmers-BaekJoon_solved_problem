

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] nums, selected, used;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N+1];
        used = new int[N+1];
        selected = new int[M+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
    }

    static void rec_func(int k, int start) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int cand = start; cand <= N; cand++) {
                if (used[cand] == 1) continue;
                selected[k] = nums[cand];
                used[cand] = 1;
                rec_func(k + 1, cand + 1);
                used[cand] = 0;
                selected[k] = 0;
            }

        }

    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1, 1);
        System.out.println(sb.toString());
    }


}
