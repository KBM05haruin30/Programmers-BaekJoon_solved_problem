
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] a = s.split(" ", -1);
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length(); j++) {
                if (j % 2 == 0) {
                    char c = a[i].charAt(j);
                    answer += Character.toUpperCase(c);
                } else {
                    answer += a[i].charAt(j);
                }
            }
            if (i < a.length-1){
                answer += " ";
            }
        
        }
        
        return answer;
    }
}