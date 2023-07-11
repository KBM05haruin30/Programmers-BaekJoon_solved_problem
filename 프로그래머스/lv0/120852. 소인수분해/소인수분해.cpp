#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(int n) {
    vector<int> answer;
    int i=2;
    while(n != 1){
        if(n % i == 0){
            if(find(answer.begin(),answer.end(),i) == answer.end()){
                answer.push_back(i);
            }
            n /= i;
        }
        else{
            i++;
        }
    }
    return answer;
}