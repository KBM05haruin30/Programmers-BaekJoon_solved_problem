import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < sizes.length; i++) {
            int maxX = 0, maxY = 0;
            if (sizes[i][0] < sizes[i][1]) {
                maxX = sizes[i][1];
                maxY = sizes[i][0];
            } else {
                maxX = sizes[i][0];
                maxY = sizes[i][1];
            }
            if (x < maxX) {
                x = maxX;
            }
            if (y < maxY) {
                y = maxY;
            }
        }
        
        answer = x * y;
        return answer;
    }
}