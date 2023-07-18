#include <string>
#include <vector>

using namespace std;
int arr[31];
int solution(vector<string> strArr) {
    int answer = 0;
    for(int i = 0; i <strArr.size(); i++){
        arr[strArr[i].length()] += 1;
    }
    int count = 0;
    for(int i = 1; i <= 31;i++){
        if(count < arr[i]){
            count = arr[i];
        }
    }
    answer = count;
    return answer;
}