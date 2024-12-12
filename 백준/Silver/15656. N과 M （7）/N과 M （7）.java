

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] nums, selected;

    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();
        nums = new int[N + 1];
        selected = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
    }

    static void rec_func(int k) {
        if (k == M + 1) {
            for(int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append('\n');
        } else {
            for(int cand = 1; cand <= N; cand++) {
                selected[k] = nums[cand];
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }

}
