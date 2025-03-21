import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> person = new HashMap<>();
        
        for (String per : participant) {
            person.put(per, person.getOrDefault(per, 0) + 1);
        }
        
        for (String com : completion) {
            person.put(com, person.get(com) -1);
        }
        
        for (String key : person.keySet()) {
            if (person.get(key) > 0) {
                return key;
            }
        }
        
        
        return answer;
    }
}