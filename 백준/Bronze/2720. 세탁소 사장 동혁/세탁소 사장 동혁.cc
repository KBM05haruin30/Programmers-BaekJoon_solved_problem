#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    int T;
    cin >> T;
    for(int i = 0; i < T; i++){
        int pay;
        cin >> pay;
        int arr[4] = {};
        if (pay >= 25) {
            arr[0] = pay / 25;
            pay = pay % 25;
        }
        if (pay >= 10) {
            arr[1] = pay / 10;
            pay = pay % 10;
        }
        if (pay >= 5) {
            arr[2] = pay / 5;
            pay = pay % 5;
        }
        if(pay >= 0){
            arr[3] = pay;
        }
        for (int i = 0; i < 4; i++) {
            cout << arr[i] << ' ';
        }
    }
}