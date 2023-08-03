#include <string>
#include <vector>
#include <map>

using namespace std;

int solution(vector<vector<string>> clothes) {
    //1.옷을 종류별로 구별하기
    map<string,int> m;
    for(vector<string> clothe : clothes){
        m[clothe[1]]++;
    }
    //2.입지 않는 경우를 추가하여 모든 조합 계산하기
    int answer = 1;
    map<string,int>::iterator it;
for(it = m.begin(); it != m.end(); it++){
    answer *= it->second + 1;
}
    //3.아무종류의 옷도 입지 않는 경우 제외하기
    return answer-1;
}