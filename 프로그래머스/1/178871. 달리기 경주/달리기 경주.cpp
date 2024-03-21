#include <string>
#include <vector>
#include <map>
using namespace std;

vector<string> solution(vector<string> players, vector<string> callings) {
    vector<string> answer;
    map<string, int> m;
    
    int playnum = players.size();
    int over = callings.size();
    
    for(int i = 0; i < playnum; i++){
        m.insert({players[i],i});
    }
    
    for(int j = 0; j < over; j++){
        string cur_name;
        int cur_rank;
        cur_name = callings[j];
        cur_rank = m[cur_name];
        
        string changename = players[cur_rank-1];
        players[cur_rank-1] = cur_name;
        players[cur_rank] = changename;
        
        m[cur_name] = cur_rank-1;
        m[changename] = cur_rank;
        
    }
    
    return players;
}