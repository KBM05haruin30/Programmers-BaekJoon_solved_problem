import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numString = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numString[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(numString, (x, y) -> (y + x).compareTo(x + y));
        
        if (numString[0].equals("0")){
            return "0";
        }
        
        for (int i = 0; i < numString.length; i++) {
            answer += numString[i];
        }
        
        
        
        return answer;
    }
}