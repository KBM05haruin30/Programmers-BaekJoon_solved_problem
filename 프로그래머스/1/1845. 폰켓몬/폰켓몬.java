
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length/2;
        HashSet<Integer> pokemon = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            pokemon.add(nums[i]);
        }
        if ( N <= pokemon.size()) {
            return N;
        } else {
            return pokemon.size();
        }
    }
}