#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> keyinput, vector<int> board) {
    vector<int> answer;
    vector<int> position(2);
    for(int i = 0; i < keyinput.size(); i++){
        if(keyinput[i] == "left"){
            if(position[0] > -(board[0]/2) ){
                position[0] -= 1;
            }
        }
        else if(keyinput[i] == "right"){
            if(position[0] < (board[0]/2)){
                position[0] += 1;
            }
        }
        else if(keyinput[i] == "up"){
            if(position[1] < board[1]/2){
                position[1] += 1;
            }
        }
        else{
            if(position[1] > -(board[1]/2)){
                position[1] -= 1;
            }
        }
    }
    answer = position;
    return answer;
}