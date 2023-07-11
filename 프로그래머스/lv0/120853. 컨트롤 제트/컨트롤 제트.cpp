#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string s) {
    int answer = 0;
    
    istringstream ss(s);
    string stringBuffer;
    vector<string> x;
    x.clear();
    while(getline(ss,stringBuffer,' ')){
        x.push_back(stringBuffer);
    }
    for(int i = 0; i < x.size(); i++){
        if(x[i] == "Z"){
            answer -= stoi(x[i-1]);
        }
        else{
            answer += stoi(x[i]);
        }
    }
    
    
    return answer;
}