#include <iostream>
#include <set>

using namespace std;

int main(){
    string s;
    cin >> s;
    
    set<string> st;
    string str = "";
    for(int i = 0; i < s.size(); i++){
        for(int j = i; j < s.size(); j++){
            str += s[j];
            st.insert(str);
        }
        str = "";
    }
    
    cout << st.size() << '\n';
}