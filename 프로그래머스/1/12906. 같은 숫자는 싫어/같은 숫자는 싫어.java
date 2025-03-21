import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int lastIdx = ans.size()-1;
            int last = ans.get(lastIdx);
            if (arr[i] != last) {
                ans.add(arr[i]);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}