#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int number;
    cin >> number;
    string s = to_string(number);
    vector<int> v;
    for(int i = 0; i < s.length(); i++){
        v.push_back((int)(s[i]-'0'));
    }
    sort(v.begin(),v.end(),greater<int>());
    string answer = "";
    for(int i= 0; i < v.size(); i++){
        answer += to_string(v[i]);
    }
    cout << answer << '\n';
}