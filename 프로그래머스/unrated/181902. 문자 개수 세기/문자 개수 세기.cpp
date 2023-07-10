#include <string>
#include <vector>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer(52);
    for(int i = 0; i < my_string.length();i++){
        if(my_string[i] >= 'A' && my_string[i] <= 'Z'){
            answer[(int)(my_string[i]-'A')]++;
        }
        else if(my_string[i] >= 'a' && my_string[i] <= 'z'){
            answer[(int)(my_string[i]-'a'+26)]++;
        }
    }
    
    
    return answer;
}