#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
using namespace std;

int main(){
    int N;
    int res = 0;
    cin >> N;
    if(N == 0){
        cout << res;
        return 0;
    }
    vector<int> v(N);
    for(int i = 0; i < N; i++){
        cin >> v[i];
    }
    sort(v.begin(),v.end());
    int idx = round(N * 0.15);
    double sum = 0;
    for(int i = idx; i < N - idx; i++){
        sum += v[i];
    }
    res = round(sum / (N - idx * 2));
    cout << res << '\n';
    
}