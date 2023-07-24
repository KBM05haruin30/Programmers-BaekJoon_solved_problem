#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> picture, int k) {
    vector<string> answer;
    for(int i = 0; i < picture.size(); i++){
        for(int j = 0; j < k; j++){
            string s ="";
            for(int l = 0; l < picture[i].size(); l++){
                for(int x = 0; x < k; x++){
                    s += picture[i][l];
                }
            }
            answer.push_back(s);
        }
    }
    return answer;
}