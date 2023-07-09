#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    int a1,a0,c,n0;
    scanf("%d %d\n", &a1,&a0);
    scanf("%d\n", &c);
    scanf("%d\n", &n0);
    
    long long fx = a1*n0 + a0;
    long long gx = c * n0;
    if(fx <= gx && a1 <= c){
        cout << 1 << '\n';
    }else{
        cout << 0 << '\n';
    }
}