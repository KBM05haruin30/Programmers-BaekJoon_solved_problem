#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    int N;
    cin >> N;
    int i = 2;
    if(N == 1){
        return 0;
    }
    for(int i = 2; i <= N; i++){
        while(N % i == 0){
            cout << i << "\n";
            N = N/i;
        }
    }
    cout << endl;
}