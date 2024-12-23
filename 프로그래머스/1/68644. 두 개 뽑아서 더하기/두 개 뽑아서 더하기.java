import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                a = numbers[i] + numbers[j];
                arr.add(a);
            }
        }
        List<Integer> arr2 = arr.stream().sorted().distinct().collect(Collectors.toList());
        int[] answer = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }
        return answer;
    }
}