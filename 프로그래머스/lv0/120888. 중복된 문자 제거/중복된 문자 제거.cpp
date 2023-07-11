#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string my_string) {
    string answer = "";
    vector<string> v;
    int flag = 0;
    
    for(int i = 0; i < my_string.length(); i++){
        string tmp = my_string.substr(i,1);
        flag = 0;
        for(int j = 0; j < v.size(); j++){
            if(v[j] == tmp){
                flag = 1;
            }
        }
        if(flag == 0){
            answer += tmp;
            v.push_back(tmp);
        }
    }
    
    return answer;
}