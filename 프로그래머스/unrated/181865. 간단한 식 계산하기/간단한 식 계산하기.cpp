#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string binomial) {
    int answer = 0;
    stringstream ss(binomial);
    string s;
    vector<string> v;
    while(getline(ss,s,' ')){
        v.push_back(s);
    }
    if(v[1] == "+"){
        answer = stoi(v[0]) + stoi(v[2]);
    }
    else if(v[1] == "-"){
        answer = stoi(v[0]) - stoi(v[2]);
    }
    else{
        answer = stoi(v[0]) * stoi(v[2]);
    }
    return answer;
}