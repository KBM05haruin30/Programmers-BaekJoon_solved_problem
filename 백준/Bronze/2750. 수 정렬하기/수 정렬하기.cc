#include <vector>
#include <stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int N,n;
    cin >> N;
    vector<int> v;
    v.clear();
    for(int i = 0; i < N; i++){
        cin >> n;
        v.push_back(n);
    }
    sort(v.begin(),v.end());
    for(int i = 0; i < v.size(); i++){
        cout << v[i] << '\n';
    }
}