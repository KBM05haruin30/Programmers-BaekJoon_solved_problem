#include <string>
#include <vector>
#include <sstream>

using namespace std;

vector<string> solution(string my_string) {
    vector<string> answer;
    stringstream s1(my_string);
    string s;
    while(s1 >> s){
        answer.push_back(s);
    }
    
    
    
    return answer;
}