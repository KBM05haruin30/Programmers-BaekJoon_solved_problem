#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr1, vector<int> arr2) {
    int answer = 0;
    int arr1sum = 0, arr2sum = 0;
    int arr1dis = arr1.size();
    int arr2dis = arr2.size();
    for(int i = 0; i < arr1dis; i++){
        arr1sum += arr1[i];
    }
    for(int j = 0; j < arr2dis; j++){
        arr2sum += arr2[j];
    }
    if(arr1dis > arr2dis){
        answer = 1;
    }
    else if(arr1dis < arr2dis){
        answer = -1;
    }
    else if(arr1dis == arr2dis){
        if(arr1sum > arr2sum){
            answer = 1;
        }
        else if(arr1sum < arr2sum){
            answer = -1;
        }
        else{
            answer = 0;
        }
    }
    return answer;
}