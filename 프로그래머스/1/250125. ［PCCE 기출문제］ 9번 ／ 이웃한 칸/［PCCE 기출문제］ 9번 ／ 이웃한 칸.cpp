#include <string>
#include <vector>
#include <list>
using namespace std;

int solution(vector<vector<string>> board, int h, int w) {
    int answer = 0;
    int n = board.size();
    int count = 0;
    list<int> dh = {0,1,-1,0};
    list<int> dw = {1,0,0,-1};
    for(int i = 0; i <= 3; i++){
        int h_check = h + dh.front();
        dh.pop_front();
        int w_check = w + dw.front();
        dw.pop_front();
        if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n ){
            if(board[h][w] == board[h_check][w_check]){
                count++;
            }
        }
    }
    return count;
}