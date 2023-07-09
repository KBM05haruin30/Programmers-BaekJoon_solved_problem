#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(string my_string, string is_prefix) {
    int answer = 0;
    vector<string> s;
    for(int i = 0; i < my_string.length(); i++){
        string st = "";
        for(int j = 0; j < my_string.length()-i; j++){
            st += my_string[j];
        }
        s.push_back(st);
    }
    if(find(s.begin(), s.end(), is_prefix) != s.end()){
        answer = 1;
    }
    return answer;
}