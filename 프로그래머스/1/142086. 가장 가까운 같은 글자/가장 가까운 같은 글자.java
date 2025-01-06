class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] eng = new int[26];
        for(int i = 0; i < eng.length; i++) {
            eng[i] = -2;
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int engnum = (int)c - 'a';
            if (eng[engnum] == -2) {
                answer[i] = -1;
                eng[engnum] = i;
            } else {
                answer[i] = i - eng[engnum];
                eng[engnum] = i;
            }
        }
        
        
        return answer;
    }
}