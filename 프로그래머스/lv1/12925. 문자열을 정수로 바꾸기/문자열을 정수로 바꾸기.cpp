#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    string n = "";
    if(s[0] == '-'){
        for(int i = 1; i < s.length(); i++){
            n+=s[i];
        }
        answer -= stoi(n);
    }
    else if(s[0] == '+'){
        for(int i = 1; i < s.length(); i++){
            n+=s[i];
        }
        answer += stoi(n);
    }
    else{
        answer += stoi(s);
    }
    return answer;
}