#include <iostream>
#include <string>
#include <stack>

using namespace std;

string s;

int main(){
    while(1){
        getline(cin, s);
        if(s == "."){
            break;
        }
        stack<char> st;
        bool flag = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s[i];
            
            if((c == '(') || c == '['){
                st.push(c);
            }
            else if(c == ')'){
                if(!st.empty() && st.top() == '('){
                    st.pop();
                }
                else{
                    flag = 1;
                    break;
                }
            }
            else if(c == ']'){
                if(!st.empty() && st.top() == '['){
                    st.pop();
                }
                else{
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0 && st.empty()){
            cout << "yes" << '\n';
        }
        else{
            cout << "no" << '\n';
        }
    }
}