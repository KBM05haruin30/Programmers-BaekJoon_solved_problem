import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] newArray = new int[commands[i][1]-commands[i][0]+1];
            int idx = 0;
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                newArray[idx] = array[j];
                idx++;
            }
            Arrays.sort(newArray);
            answer[i] = newArray[commands[i][2]-1];
            
        }
        return answer;
    }
}