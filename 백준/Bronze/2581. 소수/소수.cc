#include <stdio.h>
#include <iostream>
#include <vector>
using namespace std;

int main(){
    int M,N;
    int result = 0;
    vector<int> sosu;
    cin >> M >> N;
    for(int i = M; i <= N; i++){
        int count = 0;
        for(int j = 1; j <= i; j++){
            if(i%j == 0){
                count++;
            }
        }
        if(count == 2){
            result+=i;
            sosu.push_back(i);
        }
    }
    if(sosu.size() == 0){
        cout << -1 << endl;
    }
    else{
        cout << result << "\n" << sosu[0] << endl;
    }
   
    
    
    
}