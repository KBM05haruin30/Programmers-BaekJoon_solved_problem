#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strArr) {
    vector<string> answer;
    for(int i = 0; i < strArr.size(); i++){
        string s = strArr[i];
        if(s.find("ad") == string::npos){
            answer.push_back(s);
        }
    }
    return answer;
}