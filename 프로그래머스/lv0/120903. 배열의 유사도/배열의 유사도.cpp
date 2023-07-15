#include <string>
#include <vector>

using namespace std;

int solution(vector<string> s1, vector<string> s2) {
    int answer = 0;
    int s1distance = s1.size();
    int s2distance = s2.size();
    if(s1distance > s2distance){
        for(int i = 0; i < s2distance; i++){
            for(int j = 0; j < s1distance; j++){
                if(s1[i] == s2[j]){
                    answer++;
                }
            }
        }
    }
    else{
        for(int i = 0; i < s1distance; i++){
            for(int j = 0; j < s2distance; j++){
                if(s1[i] == s2[j]){
                    answer++;
                }
            }
        }
    }
    return answer;
}