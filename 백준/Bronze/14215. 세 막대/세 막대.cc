#include <stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int arr[3];
    int sum = 0;
    cin >> arr[0] >> arr[1] >> arr[2];
    sort(arr,arr+3);
    if(arr[0] + arr[1] > arr[2]){
        sum = arr[0] + arr[1] + arr[2];
    }
    else{
        sum = (arr[0] + arr[1])*2 -1;
    }
    cout << sum << endl;
}