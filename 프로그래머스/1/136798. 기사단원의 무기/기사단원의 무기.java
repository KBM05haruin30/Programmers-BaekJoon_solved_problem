

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt;
        for (int i = 1; i <= number; i++) {
            // 약수 구하는 방법
            // 1. 약수는 두 수의 곱이 자기 자신이 되는 것이기 때문에 제곱수를 제외하면 한 쌍으로 갖는다.
            // 2. 약수 개수가 홀수개일 경우 약수의 개수는 가운데 수를 기준으로 같은 값을 갖는다.
            // 3. 약수 개수가 짝수개일 경우 약수의 개수는 서로 대응된다.
            // 1번으로 인해 약수는 크게 제곱수와 제곱수가 아닌 경우로 나뉠 수 있으며,
            // 2, 3번으로 인해 중간 지점까지, 즉 j의 제곱이 i보다 작거나 같을 때까지 탐색한 후
            // 제곱수의 경우 1번만 카운트하고 나머지 수는 2번 카운트하면 된다.
            cnt = 0;
            for (int j = 1; j*j <= i; j++) {
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }
            if (cnt > limit) {
                cnt = power;
            }
            answer += cnt;

        }

        return answer;
    }
}