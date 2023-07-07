#include <stdio.h>
#include <iostream>


using namespace std;

int main(){
    int n;
    int arr[100001];
    while(1){
        int p = 0;
        int sum = 0;
        cin >> n;
        if(n == -1){
            break;
        }
        for(int i = 1; i < n; i++){
            if(n%i == 0){
                arr[p++] = i;
                sum += i;
            }
        }
        if(sum == n){
            cout << n << " = " ;
            for(int i = 0; i < p-1; i++){
                cout << arr[i] << " + ";
                arr[i] = 0;
            }
            cout << arr[p-1] << '\n';
            arr[p-1] = 0;
        }else{
            cout << n << " is NOT perfect." << '\n';
        }
    }
}