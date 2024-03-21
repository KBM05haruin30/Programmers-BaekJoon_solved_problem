#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    string yoil[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    int days[] = {31,29,31,30,31,30,31,31,30,31,30,31};
    int day = 0;
    for(int i = 0; i < (a-1); i++){
        day += days[i];
    }
    day += (b-1);
    day %= 7;
    answer = yoil[day];
    return answer;
}