#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = true;
    string s = to_string(x);
    int di = 0;
    for(int i = 0; i < s.length(); i++){
        di += int(s[i] - '0');
    }
    if(x % di == 0){
        answer = true;
    }
    else{
        answer = false;
    }
    return answer;
}