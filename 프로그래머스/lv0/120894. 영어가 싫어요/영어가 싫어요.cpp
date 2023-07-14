#include <string>
#include <vector>

using namespace std;

long long solution(string numbers) {
    long long answer = 0;
    for(int i = 0; i < numbers.length(); i++){
        int n = 0;
        if(numbers[i] == 'z'){
            n = 0;
            i = i + 3;
        }
        else if(numbers[i] == 'o'){
            n = 1;
            i = i + 2;
        }
        else if(numbers[i] == 't'){
            if(numbers[i+1] == 'w'){
                n = 2;
                i = i + 2;
            }
            else{
                n = 3;
                i = i + 4;
            }
        }
        else if(numbers[i] == 'f'){
            if(numbers[i+1] == 'o'){
                n = 4;
                i = i + 3;
            }
            else{
                n = 5;
                i = i+3;
            }
        }
        else if(numbers[i] == 's'){
            if(numbers[i+1]=='i'){
                n = 6;
                i = i+2;
            }
            else{
                n = 7;
                i = i + 4;
            }
        }
        else if(numbers[i] == 'e'){
            n = 8;
            i = i + 4;
        }
        else if(numbers[i] == 'n'){
            n = 9;
            i = i + 3;
        }
        answer = answer*10 + n;
    }
    
    return answer;
}