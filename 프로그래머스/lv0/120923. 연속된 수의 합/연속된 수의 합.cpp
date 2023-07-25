#include <string>
#include <vector>

using namespace std;

vector<int> solution(int num, int total) {
    vector<int> answer;
    int count = 0;
    for(int i = 0; i < num; i++){
        count += i;
    }
    total = total - count;
    int j = total/num;
    for(int i = 0; i < num; i++){
        answer.push_back(j + i);
    }
    return answer;
}