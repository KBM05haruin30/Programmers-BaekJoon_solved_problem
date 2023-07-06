#include <string>
#include <vector>

using namespace std;

string solution(int age) {
    string answer = "";
    string aged = to_string(age);
    for(int i = 0; i < aged.length(); i++){
        answer.push_back(aged[i] - '0' + 'a');
    }
    return answer;
}