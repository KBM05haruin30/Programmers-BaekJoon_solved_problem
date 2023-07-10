#include <string>
#include <vector>

using namespace std;

int solution(vector<int> box, int n) {
    int answer = 0;
    int count = 1;
    for(int i = 0; i < box.size();i++){
        count = count * (box[i]/n);
    }
    answer = count;
    return answer;
}