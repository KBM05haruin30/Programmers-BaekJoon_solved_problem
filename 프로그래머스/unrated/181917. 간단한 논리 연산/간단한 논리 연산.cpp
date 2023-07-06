#include <string>
#include <vector>

using namespace std;

bool solution(bool x1, bool x2, bool x3, bool x4) {
    bool answer = true;
    if((x1 or x2) and (x3 or x4)){
        answer = true;
    }
    else{
        answer = false;
    }
    return answer;
}