#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> strArr) {
    vector<string> answer;
    
    for(int i = 0; i < strArr.size(); i++){
        string s = strArr[i];
        if(i % 2 != 0){
            for(int j = 0; j < s.length(); j++){
                s[j] = toupper(s[j]);
            }
            answer.push_back(s);
        }
        else{
            for(int j = 0; j < s.length(); j++){
                s[j] = tolower(s[j]);
            }
            answer.push_back(s);
        }
    }
    return answer;
}