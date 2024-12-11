

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N;
    static long[] a;

    static void input() {
        N = scan.nextInt();
        a = new long[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = scan.nextLong();
        }
    }

    static void pro() {
        // Sort 정렬하기
        Arrays.sort(a, 1, N + 1);

        // mode: 최빈값, modeCnt: 최빈값의 등장 횟수, curCnt: 현재 값(a[1])의 등장 횟수
        long mode = a[1];
        int modeCnt = 1, curCnt = 1;

        // TODO
        // 2번 원소부터 차례대로 보면서, 같은 숫자가 이어서 나오고 있는 지, 새로운 숫자가
        // 나왔는 지를 판단하여 curCnt를 갱신해주고, 최빈값을 갱신하는 작업
        for (int i = 2; i <= N; i++) {
            if (a[i] == a[i-1]) {
                curCnt++;
            } else {
                curCnt = 1;
            }
            if (modeCnt < curCnt) {
                modeCnt = curCnt;
                mode = a[i];
            }
        }

        // 정답 출력하기
        System.out.println(mode);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}
