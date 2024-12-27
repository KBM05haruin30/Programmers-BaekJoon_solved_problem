import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, Integer> num = new HashMap<>();
        num.put("zero", 0);
        num.put("one", 1);
        num.put("two", 2);
        num.put("three", 3);
        num.put("four", 4);
        num.put("five", 5);
        num.put("six", 6);
        num.put("seven", 7);
        num.put("eight", 8);
        num.put("nine", 9);
        String number = "";
        String finalnumber = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                finalnumber  = finalnumber + s.charAt(i);
            } else {
                number = number + s.charAt(i);
            }
            if (num.containsKey(number)) {
                finalnumber = finalnumber + num.get(number);
                number = "";
            }
        }
        answer = Integer.parseInt(finalnumber);
        return answer;
    }
}