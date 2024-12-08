class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int change = phone_number.length() - 4;
        
        for(int i = 0; i < change; i++) {
           answer += "*"; 
        }
        answer += phone_number.substring(change);
        return answer;
    }
}