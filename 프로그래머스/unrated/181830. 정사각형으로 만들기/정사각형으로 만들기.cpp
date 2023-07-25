#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr) {
    vector<vector<int>> answer = arr;
    int max_size = max(arr.size(), arr[0].size());
    for(vector<int>&row : answer){
        row.resize(max_size,0);
    }
    
    while(answer.size() < max_size){
        answer.push_back(vector<int>(max_size,0));
    }
    return answer;
}