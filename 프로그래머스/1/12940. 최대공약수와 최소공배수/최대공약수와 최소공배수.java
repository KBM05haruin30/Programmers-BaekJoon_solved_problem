import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        ArrayList<Integer> arrN = new ArrayList<>();
        ArrayList<Integer> arrM = new ArrayList<>();
        int max = Math.max(n, m);
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                arrN.add(i);
            }
        }
        answer[0] = arrN.get(arrN.size()-1);
        int a = n / answer[0];
        int b = m / answer[0];
        answer[1] = a * b * answer[0];
        
        
        return answer;
    }
}