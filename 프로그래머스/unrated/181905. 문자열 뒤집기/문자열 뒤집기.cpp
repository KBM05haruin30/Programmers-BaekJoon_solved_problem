#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string my_string, int s, int e) {
    string answer = "";
    vector<char> st;
    for(int i = 0; i < s; i++){
        answer+=my_string[i];
    }
    for(int j = s; j <= e; j++){
        st.push_back(my_string[j]);
    }
    reverse(st.begin(),st.end());
    for(int i = 0; i < st.size(); i++){
        answer += st[i];
    }
    for(int k = e+1; k < my_string.length(); k++){
        answer += my_string[k];
    }
    
    
    
    return answer;
}