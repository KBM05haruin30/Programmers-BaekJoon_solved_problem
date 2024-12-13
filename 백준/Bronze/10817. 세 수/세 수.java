

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int[] A;

    static void input() {
        A = new int[4];
        for (int i = 1; i < 4; i++) {
            A[i] = sc.nextInt();
        }
    }

    static void pro() {
        // TODO
        // 입력 값 정렬
        Arrays.sort(A);
        // 두 번째로 큰 정수 출력
        System.out.println(A[2]);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}
