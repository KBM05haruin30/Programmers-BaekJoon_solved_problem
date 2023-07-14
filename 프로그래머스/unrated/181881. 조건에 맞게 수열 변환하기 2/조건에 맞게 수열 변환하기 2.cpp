#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr) {
    int answer = 0;
    while(1){
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr[i] % 2 == 0 && arr[i] >= 50){
                arr[i] = arr[i]/2;
                count++;
            }
            else if(arr[i] < 50 && arr[i] % 2 != 0){
                arr[i] = arr[i]*2 + 1;
                count++;
            }
            else
                continue;
        }
        if(count == 0){
            break;
        }
        answer++;
    }
    
    
    return answer;
}