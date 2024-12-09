
import java.util.Scanner;

public class Main {
    static int N, max, min;
    static int[] nums, operators, order;
    static StringBuilder sb = new StringBuilder();

    // 입력 받기
    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        nums = new int[N + 1];
        operators = new int[5];
        order = new int[N + 1];
        for (int i = 1; i <= N; i++) nums[i] = scan.nextInt();
        for (int i = 1; i <= 4; i++) operators[i] = scan.nextInt();

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    // 피연산자 2개와 연산자가 주어졌을 때 계산해주는 함수
    static int calculator(int operand1, int operator, int operand2) {
        // value, order[i], num[i+1]
        if (operator == 1) // +
            return operand1 + operand2;
        else if (operator == 2) // -
            return operand1 - operand2;
        else if (operator == 3) // *
            return operand1 * operand2;
        else // /
            return operand1 / operand2;
    }


    // order[1...N-1] 에 연산자들이 순서대로 저장될 것이다.
    static void rec_func(int k, int value) {
        if (k == N) { // 모든 연산자들을 전부 나열하는 방법을 찾은 상태
            //	완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
            // int value = calculator();
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            // k 번째 연산자는 무엇을 선택할 것인가?
            for (int cand = 1; cand <= 4; cand++) {
                if (operators[cand] >= 1) {
                    operators[cand]--;
                    order[k] = cand;
                    int new_value = calculator(value, cand, nums[k + 1]);
                    rec_func(k+1, new_value);
                    operators[cand]++;
                    order[k] = 0;
                }
            }
            // 4 가지의 연산자들 중에 뭘 쓸 것인지 선택하고 재귀호출하기
        }
    }


    // 실행하기
    public static void main(String[] args) {
        input();
        // 1 번째 원소부터 M 번째 원소를 조건에 맞게 고르는 모든 방법을 탐색해줘
        rec_func(1, nums[1]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }

}
