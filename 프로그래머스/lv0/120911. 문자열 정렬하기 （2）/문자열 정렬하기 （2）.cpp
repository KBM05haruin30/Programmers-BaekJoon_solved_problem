#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string my_string) {
    string answer = "";
    for(int i = 0; i < my_string.length(); i++){
        my_string[i] = tolower(my_string[i]);
    }
    answer = my_string;
    sort(answer.begin(),answer.end());
    return answer;
}