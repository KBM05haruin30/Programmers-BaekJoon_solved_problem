#include <string>
#include <vector>

using namespace std;

int solution(vector<int> common) {
    int answer = 0;
    
    int index0 = common[0];
    int index1 = common[1];
    int index2 = common[2];
    
    if((index2 - index1) == (index1 - index0)){
        return common[common.size()-1] + (index1-index0);
    }
    else{
        return common[common.size()-1] * (index2/index1);
    }
    return answer;
}