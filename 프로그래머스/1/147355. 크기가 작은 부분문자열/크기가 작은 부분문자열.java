class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - pLength; i++) {
            String subT = t.substring(i, i + pLength);
            long subNum = Long.parseLong(subT);
            if (subNum <= pNum) {
                answer++;
            }
        }
            
        return answer;
    }
}