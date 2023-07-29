#include <iostream>

using namespace std;

int main(){
    int N, K;
    cin >> N >> K;
    int a = 1, b = 1, c = 1;
    int d = N - K;
    while(N > 0){
        a = a*N;
        N--;
    }
    while(K > 0){
        b = b * K;
        K--;
    }
    while(d > 0){
        c = c * d;
        d--;
    }
    cout << a/(b*c) << '\n';
}