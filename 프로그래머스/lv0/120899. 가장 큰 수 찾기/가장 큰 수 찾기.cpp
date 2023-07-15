#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array) {
    vector<int> answer;
    vector<int> cv = array;
    sort(cv.begin(), cv.end());
    answer.push_back(cv[cv.size()-1]);
    for(int i = 0; i < array.size(); i++){
        if(array[i] == cv[cv.size()-1]){
            answer.push_back(i);
        }
    }
    
    return answer;
}