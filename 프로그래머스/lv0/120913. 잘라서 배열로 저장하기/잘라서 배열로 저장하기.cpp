#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_str, int n) {
    vector<string> answer;
    int div;
    int dis = my_str.length();
    if(dis % n == 0){
        div = dis / n;
    }
    else{
        div = dis / n + 1;
    }
    int idx = 0;
    for(int i = 0; i < div; i++){
        string s = "";
        int nidx = n + idx;
        if(nidx >= dis){
            nidx = dis;
        }
        for(int j = idx; j < nidx; j++){
                s += my_str[j];
        }
        answer.push_back(s);
        idx = idx + n;
    }
    
    
    return answer;
}