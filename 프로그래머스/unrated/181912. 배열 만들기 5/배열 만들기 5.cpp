#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> intStrs, int k, int s, int l) {
    vector<int> answer;
    for(int i = 0; i < intStrs.size(); i++){
        string st = "";
        string intStr = intStrs[i];
        for(int j = s; j <= s + l - 1; j++){
            st+=intStr[j];
        }
        if(stoi(st) > k){
            answer.push_back(stoi(st));
        }
    }
    return answer;
}