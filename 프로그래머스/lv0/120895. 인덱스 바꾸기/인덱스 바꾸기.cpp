#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int num1, int num2) {
    string answer = "";
    char c1 = my_string[num1];
    char c2 = my_string[num2];
    for(int i = 0; i < my_string.length(); i++){
        if(i == num1){
            answer += c2;
        }
        else if(i == num2){
            answer += c1;
        }
        else{
            answer += my_string[i];
        }
    }
    return answer;
}