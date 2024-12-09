

import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    static void input() {
        N = sc.nextInt();
        S = sc.nextInt();
        nums = new int[N + 1];
        for (int i = 1; i <= N; i++) nums[i] = sc.nextInt();
    }

    static int N, S, ans;
    static int[] nums;
    // k번째 원소를 포함시킬 지 정하는 함수
    // value:= k-1 번째 원소까지 골라진 원소들의 합
    static void rec_func(int k, int value) {
        if (k == N + 1) { // 부분 수열을 하나 완성 시킨 상태
            // value 가 S랑 같은 지 확인하기
            if (value == S) ans++;
        } else {
            // k 번째 원소를 포함시킬 지 결정하고 재귀호출해주기
            // Include
            rec_func(k + 1, value + nums[k]);
            // Not Include
            rec_func(k + 1, value);
        }
    }

    public static void main(String args[]) {
        input();
        // 1 번째 원소부터 M 번째 원소를 조건에 맞게 고르는 모든 방법을 탐색해줘
        rec_func(1, 0);
        // ans 가 정말 "진 부분집합"만 다루는 지 확인하기
        if (S == 0){
            ans--; // 공집합 부분 빼기
        }
        System.out.println(ans);
    }

}
