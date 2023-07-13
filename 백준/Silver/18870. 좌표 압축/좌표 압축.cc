#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    int N;
    cin >> N;
    vector<int> v(N);
    for(int i = 0; i < N; i++){
        cin >> v[i];
    }
    vector<int> cv(v);
    sort(cv.begin(),cv.end());
    cv.erase(unique(cv.begin(),cv.end()),cv.end());
    for(int i = 0; i < N; i++){
        cout << lower_bound(cv.begin(),cv.end(),v[i]) - cv.begin() << ' ';
    }
}