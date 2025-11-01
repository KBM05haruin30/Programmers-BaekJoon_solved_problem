#include <stdio.h>
#include <iostream>
#include <vector>

using namespace std;

int main(){
    string s;
    cin >> s;
    int idx;
    vector<string> croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
    for(int i = 0; i < croa.size(); i++){
        while(true){
            idx = s.find(croa[i]);
            if(idx == string::npos){
                break;
            }
            s.replace(idx,croa[i].length(),"#");
        }
    }
    cout << s.length();
}