#include <stdio.h>
#include <iostream>
#include <vector>

using namespace std;

int main(){
    int N,K;
    vector<int> answer;
    cin >> N >> K;
    for(int i = 1; i <= N; i++){
        if(N%i == 0){
            answer.push_back(i);
        }
    }
    if(answer.size() < K){
        cout << 0 <<'\n';
    }
    else{
        cout << answer[K-1] << '\n';
    }
}