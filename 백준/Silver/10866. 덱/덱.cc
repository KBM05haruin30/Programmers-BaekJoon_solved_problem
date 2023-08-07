#include <iostream>
#include <deque>

using namespace std;
int N, M;
deque<int> dq;
string s;
int main(){
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> s;
        if(s == "push_front"){
            cin >> M;
            dq.push_front(M);
        }
        else if(s == "push_back"){
            cin >> M;
            dq.push_back(M);
        }
        else if(s == "pop_front"){
            if(!dq.empty()){
                cout << dq.front() << '\n';
                dq.pop_front();
            }
            else{
                cout << -1 << '\n';
            }
        }
        else if(s == "pop_back"){
            if(!dq.empty()){
                cout << dq.back() << '\n';
                dq.pop_back();
            }
            else{
                cout << -1 << '\n';
            }
        }
        else if(s == "size"){
            cout << dq.size() << '\n';
        }
        else if(s == "empty"){
            cout << dq.empty() << '\n';
        }
        else if(s == "front"){
            if(!dq.empty()){
                cout << dq.front() << '\n';
            }
            else{
                cout << -1 << '\n';
            }
        }
        else if(s == "back"){
            if(!dq.empty()){
                cout << dq.back() << '\n';
            }
            else{
                cout << -1 << '\n';
            }
        }
    }
}
