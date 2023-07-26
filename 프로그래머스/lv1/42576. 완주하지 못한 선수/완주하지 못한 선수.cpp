#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";
    unordered_map<string,int> m;
    for(auto player : participant){
        if(m.end() == m.find(player)){
            m.insert(make_pair(player,1));
        }
        else{
            m[player]++;
        }
    }
    for(auto player : completion){
        m[player]--;
    }
    for(auto player : participant){
        if(m[player]> 0){
            answer = player;
            break;
        }
    }
    return answer;
}