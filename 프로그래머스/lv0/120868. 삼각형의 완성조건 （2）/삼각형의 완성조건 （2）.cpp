#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    sort(sides.begin(),sides.end());
    
    for(int i = 1; i <= sides[1]; i++){
        if((sides[0] + i )> sides[1]){
            answer++;
        }
    }
    int j = 1;
    while((sides[0] + sides[1]) > (sides[1] + j)){
        answer++;
        j++;
    }
    return answer;
}