#include <iostream>
#include <map>

using namespace std;
map<string, string,greater<>> m;
int N;
string name, chulip;

int main(){
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> name >> chulip;
        m[name] = chulip;
    }
    map<string,string>::iterator it;
    for(it= m.begin(); it!=m.end(); it++){
        if(it->second == "enter"){
            cout << it->first << '\n';
        }
    }
    
    
    
    
}