#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    int N,num;
    int result = 0;
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> num;
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            result++;
        }
    }
    cout << result << endl;
}