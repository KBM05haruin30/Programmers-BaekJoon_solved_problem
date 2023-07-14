#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 1;
    int distance = num_list.size();
    if(distance >= 11){
        for(int i = 0; i < num_list.size(); i++){
            answer += num_list[i];
        }
        answer -= 1;
    }
    else{
        for(int i = 0; i < num_list.size(); i++){
            answer *= num_list[i];
        }
    }
    return answer;
}