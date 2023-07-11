#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    vector<int> v;
    int n;
    for(int i = 0; i < 5; i++){
        cin >> n;
        v.push_back(n);
    }
    sort(v.begin(), v.end());
    int sum = 0;
    for(int i = 0; i < v.size(); i++){
        sum += v[i];
    }
    int mid = v.size()/2;
    cout << sum / 5 << "\n" << v[mid] << '\n';
}