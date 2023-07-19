#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> rank, vector<bool> attendance) {
    int answer = 0;
    vector<int> v;
    for(int i = 0; i < rank.size(); i++){
        if(attendance[i]){
            v.push_back(rank[i]);
        }
    }
    sort(v.begin(),v.end());
    for(int i = 0; i < rank.size(); i++){
        if(v[0] == rank[i]){
            answer += 10000 * i;
        }
        else if(v[1] == rank[i]){
            answer += 100 * i;
        }
        else if(v[2] == rank[i]){
            answer += i;
        }
    }
    return answer;
}