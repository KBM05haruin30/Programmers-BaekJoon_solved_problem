#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(string my_string, string target) {
    int answer = 0;
    vector<string> v;
    for(int i = 0; i < my_string.length()-1; i++){
        string s = "";
        s += my_string[i];
        v.push_back(s);
        for(int j = i+1; j < my_string.length(); j++){
            s += my_string[j];
            v.push_back(s);
        }
    }
    if(find(v.begin(),v.end(),target) != v.end()){
        answer = 1;
    }
    return answer;
}