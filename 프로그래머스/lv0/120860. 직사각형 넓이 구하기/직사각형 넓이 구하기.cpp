#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

bool cmp(vector<int> &v1, vector<int> &v2){
    if(v1[1] == v2[1])
        return v1[0]<v2[0];
    else
        return v1[1]<v2[1];
}

int solution(vector<vector<int>> dots) {
    int answer = 0;
    vector<vector<int>> cv1 = dots;
    vector<vector<int>> cv2 = dots;
    
    sort(cv1.begin(),cv1.end());
    int x = abs(cv1[0][0] - cv1[3][0]);
    sort(cv2.begin(),cv2.end(),cmp);
    int y = abs(cv1[0][1] - cv2[3][1]);
    answer = x * y;
    
    
    
    return answer;
}