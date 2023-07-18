#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    answer = arr;
    int i = 1;
    int count = 0;
    while(arr.size() > i){
        i = i * 2;
    }
    for(int j = 0; j < i-arr.size(); j++){
        answer.push_back(0);
    }
    return answer;
}