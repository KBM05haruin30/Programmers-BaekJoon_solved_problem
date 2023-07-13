#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

bool campare(string a, string b){
    if(a.length() == b.length()){
        return a<b;
    }
    else{
        return a.length() < b.length();
    }
}

int main(){
    int N;
    cin >> N;
    vector<string> v;
    for(int i = 0; i < N; i++){
        string s;
        cin >> s;
        v.push_back(s);
    }
    sort(v.begin(),v.end(),campare);
    v.erase(unique(v.begin(),v.end()),v.end());
    for(int i = 0; i < v.size(); i++){
        cout << v[i] << '\n';
    }

}