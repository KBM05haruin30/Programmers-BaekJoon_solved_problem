#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> ans;
    for(int i = 0; i < n; i++){
        int sum = i;
        string st = to_string(i);
        for(int j = 0; j < st.length(); j++){
            sum += (int)(st[j]-'0');
        }
        if(sum == n){
            ans.push_back(i);
        }
    }
    sort(ans.begin(),ans.end());
    if(ans.empty()){
        cout << 0 <<'\n';
    }
    else{
        cout << ans[0] << '\n';
    }
    
    
}