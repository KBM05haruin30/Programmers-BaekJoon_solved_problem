#include <string>
#include <vector>
#include <algorithm>
#include <sstream>

using namespace std;

vector<string> solution(string myString) {
    vector<string> answer;
    string token;
    stringstream ss(myString);
    
    while(getline(ss,token, 'x')){
        if(!token.empty()){
            answer.push_back(token);
        }
    }
    sort(answer.begin(), answer.end());
    return answer;
}