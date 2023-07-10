#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int mul = 1;
    int i = 1;
    while(mul <= n){
        mul = mul * i;
        i++;
    }
    answer = i-2;
    return answer;
}