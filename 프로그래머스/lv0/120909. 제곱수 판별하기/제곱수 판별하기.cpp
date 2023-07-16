#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 0;
    for(int i = 1; i * i <= n; i++){
        if(n == pow(i,2)){
            answer = 1;
        }
        else{
            answer = 2;
        }
    }
    return answer;
}