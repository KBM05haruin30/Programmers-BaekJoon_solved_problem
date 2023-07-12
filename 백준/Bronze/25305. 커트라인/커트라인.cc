#include <stdio.h>
#include <iostream>

using namespace std;

int arr[1000];

int main(){
    int N, k;
    cin >> N >> k;
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            if(arr[i] < arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    cout << arr[N-k] << '\n';
}