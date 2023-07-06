#include <iostream>

using namespace std;

int main(){
    int idx;
    cin >> idx;
    int i = 1;
    while(idx > i){
        idx-= i;
        i++;
    }
    if(i%2 == 1){
        cout << i+1-idx << '/' << idx <<endl;
    }
    else{
        cout << idx << '/' << i + 1 - idx << endl;
    }
}