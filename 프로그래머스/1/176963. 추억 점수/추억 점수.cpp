#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> name, vector<int> yearning, vector<vector<string>> photo) {
    vector<int> answer;

    for(int i = 0; i < photo.size(); i++){
        int totalscore = 0;
        for(int j = 0; j < name.size(); j++){
            auto it = find(photo[i].begin(),photo[i].end(),name[j]);
            if(it != photo[i].end()){
                totalscore += yearning[j];
            }
        }
        answer.push_back(totalscore);
    }
    
    return answer;
}