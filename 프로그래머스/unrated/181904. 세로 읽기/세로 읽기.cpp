#include <string>
#include <vector>

using namespace std;
char arr[1000][1000];
string solution(string my_string, int m, int c) {
    string answer = "";
    for(int i = 0; i < my_string.length()/m;i++ ){
        for(int j = 0; j < m; j++){
            arr[i][j] = my_string[(i*m)+j];
        }
    }
    for(int i = 0; i < my_string.length()/m; i++){
        answer += arr[i][c-1];
    }
    return answer;
}