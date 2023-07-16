#include <string>
#include <vector>
#include <sstream>

using namespace std;

vector<string> solution(vector<string> quiz) {
    vector<string> answer;
    for(int i = 0; i < quiz.size(); i++){
        string a,b,c,d,e;
        string s1 = quiz[i];
        stringstream s2(s1);
        s2 >> a >> b >> c >> d >> e;
        
        int a1 = stoi(a);
        int b1 = stoi(c);
        int c1 = stoi(e);
        
        if(b == "-"){
            if(c1 == (a1 - b1)){
                answer.push_back("O");
            }
            else{
                answer.push_back("X");
            }
        }
        else{
            if(c1 == (a1 + b1)){
                answer.push_back("O");
            }
            else{
                answer.push_back("X");
            }
        }
        
        
        
    }
    return answer;
}