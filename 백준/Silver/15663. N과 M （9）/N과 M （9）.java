

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] nums, selected, used;

    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();
        nums = new int[N+1];
        selected = new int[M+1];
        used = new int[N+1];
        for (int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
    }

    static void rec_func(int k) {
        if (k == M+1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            int lastUsed = 0;
            for (int cand = 1; cand <= N; cand++) {
                if (used[cand] == 0 && nums[cand] != lastUsed) {
                    selected[k] = nums[cand];
                    used[cand] = 1;
                    lastUsed = nums[cand];
                    rec_func(k + 1);
                    selected[k] = 0;
                    used[cand] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }


}
