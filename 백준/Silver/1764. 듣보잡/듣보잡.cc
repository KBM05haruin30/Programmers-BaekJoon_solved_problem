#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
int N, M;
string s;
map<string,int> m;
vector<string> v;
int main(){
    cin >> N >> M;
    for(int i = 0; i < N + M; i++){
        cin >> s;
        m[s]++;
        if(m[s] > 1){
            v.push_back(s);
        }
    }
    sort(v.begin(),v.end());
    cout << v.size() << "\n";
    for(int i = 0; i < v.size(); i++){
        cout << v[i] << '\n';
    }
}
