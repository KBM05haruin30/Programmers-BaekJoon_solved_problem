#include <string>
#include <vector>

using namespace std;

string solution(int q, int r, string code) {
    string answer = "";
    vector<int> st;
    for(int i = 0; i < code.length(); i++){
        st.push_back(i%q);
    }
    for(int j = 0; j < st.size(); j++){
        if(st[j] == r){
            answer += code[j];
        }
    }
    return answer;
}