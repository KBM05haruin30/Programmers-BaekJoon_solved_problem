#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(string my_string) {
    vector<string> answer;
    for(int i = 0; i < my_string.length(); i++){
        string st = "";
        for(int j = i; j < my_string.length(); j++){
            st += my_string[j];
        }
        answer.push_back(st);
    }
    sort(answer.begin(),answer.end());
    return answer;
}