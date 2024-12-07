class Solution {
    public int solution(int num) {
        int answer = 0;
        if (num == 1) {
            return 0;
        }
        long x = num;
        while(answer < 500) {
            if (x %2==0) {
                x = x/2;
            } else {
                x = x * 3 + 1;
            }
            answer++;
            if (x == 1) {
                return answer;
            }
        }
        
        return -1;
    }
}