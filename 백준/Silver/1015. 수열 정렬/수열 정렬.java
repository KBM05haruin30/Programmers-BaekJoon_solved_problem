
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Elem implements Comparable<Elem> {

        /**
         * @param idx A 배열의 idx 위치를 기억하는 변수
         * @param num A[idx]의 원래 값
         */
        public int num, idx;

        @Override
        public int compareTo(Elem other) {
            // TODO
            // 정렬 조건에 맞게 정렬하기
            // 1. num의 비내림차순
            // 2. num이 같으면 idx 오름차순
            if (num != other.num) return num - other.num;
            return idx - other.idx;
        }
    }

    static StringBuilder sb = new StringBuilder();
    static Scanner scan = new Scanner(System.in);

    static int N;
    static int[] P;
    static Elem[] B;

    static void input() {
        N = scan.nextInt();
        B = new Elem[N];
        P = new int[N];
        for(int i = 0; i < N; i++) {
            B[i] = new Elem();
            // TODO: Elem의 정의에 맞게 B[i]에 값을 넣어주기
            B[i].num = scan.nextInt();
            B[i].idx = i;
        }
    }

    static void pro() {
        // TODO: B 배열 정렬하기
        Arrays.sort(B);

        // TODO: B 배열의 값을 이용해서 P 배열 채우기
        for (int b_idx = 0; b_idx < N; b_idx++) {
            P[B[b_idx].idx] = b_idx;
        }

        // TODO: P 배열 출력하기
        for (int i = 0; i < N; i++) {
            sb.append(P[i]).append(' ');
        }
        System.out.println(sb.toString() );
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}
