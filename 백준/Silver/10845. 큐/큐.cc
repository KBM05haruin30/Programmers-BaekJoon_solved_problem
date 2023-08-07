#include <iostream>
#include <queue>

using namespace std;
queue<int> q;
int main(){
    int N;
    cin >> N;
    string s;
    int n;
    for(int i = 0; i < N; i++){
        cin >> s;
        if(s == "push"){
            cin >> n;
            q.push(n);
        }
        else if(s == "pop"){
            if(!q.empty()){
                cout << q.front() << '\n';
                q.pop();
            }
            else{
                cout << -1 << '\n';
            }
        }
        else if(s == "size"){
            cout << q.size() << '\n';
        }
        else if(s == "empty"){
            cout << q.empty() << '\n';
        }
        else if(s == "front"){
            if(!q.empty()){
                cout << q.front() << '\n';
            }
            else{
                cout << -1 <<'\n';
            }
        }
        else if(s == "back"){
            if(!q.empty()){
                cout << q.back() << '\n';
            }
            else{
                cout << -1 << '\n';
            }
        }
    }
}