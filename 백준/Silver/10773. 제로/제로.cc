#include <iostream>
#include <stack>

using namespace std;

stack<int> st;
int K, n, stsize;

int main(){
    cin >> K;
    for(int i = 0; i < K; i++){
        cin >> n;
        if(n != 0){
            st.push(n);
        }
        else{
            st.pop();
        }
    }
    int answer = 0;
    stsize = st.size();
    for(int i = 0; i < stsize; i++){
        answer += st.top();
        st.pop();
        }
    cout << answer << '\n';
}