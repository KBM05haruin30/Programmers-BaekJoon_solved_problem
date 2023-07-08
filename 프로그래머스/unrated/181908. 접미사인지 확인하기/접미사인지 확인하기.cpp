#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(string my_string, string is_suffix) {
    int answer = 0;
    for(int i = 0; i < my_string.length(); i++){
        string st = "";
        for(int j = i; j < my_string.length(); j++){
            st += my_string[j];
        }
        if(st == is_suffix){
            answer = 1;
        }
    }
    
    return answer;
}