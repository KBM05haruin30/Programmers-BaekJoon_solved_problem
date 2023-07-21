#include <iostream>
#include <map>

using namespace std;
map<int,bool> m;
int N,M,num;
int main(){
    cin >> N >>M;
    for(int i = 0; i < N+M; i++){
        cin >> num;
        if(m[num] == true){
            m.erase(num);
        }
        else{
            m[num] = true;
        }
    }
    cout << m.size();
}