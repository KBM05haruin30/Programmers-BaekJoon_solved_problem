class Solution {
    public String solution(String phone_number) {
        char[] change = phone_number.toCharArray();
        for(int i = 0; i < change.length-4; i++) {
            change[i] = '*';
        }
        return String.valueOf(change);
    }
}