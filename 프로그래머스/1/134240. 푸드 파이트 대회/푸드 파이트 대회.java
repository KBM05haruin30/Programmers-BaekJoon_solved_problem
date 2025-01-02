class Solution {
    public String solution(int[] food) {
        String answer = "";
        String reverse = "";
        int cnt = 0;
        int flength = food.length;
        for (int i = 1; i < flength; i++) {
            cnt = food[i]/2;
            for (int j = 0; j < cnt; j++) {
                answer += i;
            }
        }
        for (int i = answer.length()-1; i >= 0; i--) {
            reverse += answer.charAt(i);
        }
        
        answer += 0;
        answer += reverse;
        return answer;
    }
}