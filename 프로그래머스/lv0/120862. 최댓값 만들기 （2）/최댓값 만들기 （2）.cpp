#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    vector<int> v;
    for(int i = 0; i < numbers.size()-1; i++){
        for(int j = i+1; j < numbers.size(); j++){
            v.push_back(numbers[i] * numbers[j]);
        }
    }
    sort(v.begin(),v.end());
    answer = v.back();
    return answer;
}