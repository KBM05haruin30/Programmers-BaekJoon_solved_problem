#include <stdio.h>
#include <iostream>
#include <cmath>
using namespace std;

int main(){
    string N;
    int B;
    cin >> N >> B;
    long long sum = 0;
    for(int i = 0; i < N.length(); i++){
        int temp = N[N.length() - (i+1)];
        
        if(temp >= '0' && temp <= '9'){
            temp = temp - '0';
        }
        else{
            temp = temp + 10 - 'A';
        }
        sum += (temp * (int)pow(B,i));
    }
    cout << sum << endl;
}