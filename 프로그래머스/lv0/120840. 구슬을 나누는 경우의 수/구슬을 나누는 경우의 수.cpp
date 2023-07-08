#include <string>
#include <vector>

using namespace std;
//파스칼의 삼각형
int arr[31][31];

int solution(int balls, int share) {
    int answer = 0;
    
    for(int i = 0; i < 31; i++){
        arr[i][0] = arr[i][i] = 1;
    }
    for(int i = 2; i < 31; i++){
        for(int j = 1; j < i; j++){
            arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
        }
    }
    answer = arr[balls][share];
    return answer;
}