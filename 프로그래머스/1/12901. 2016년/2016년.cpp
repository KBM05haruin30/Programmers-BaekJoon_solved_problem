#include <string>
#include <vector>
#include <map>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    map<int, string> yoil;
    yoil.insert({2,"SUN"});
    yoil.insert({3,"MON"});
    yoil.insert({4,"TUE"});
    yoil.insert({5,"WED"});
    yoil.insert({6,"THU"});
    yoil.insert({0,"FRI"});
    yoil.insert({1,"SAT"});
    map<int, int> days;
    days.insert({1,31});
    days.insert({2,29});
    days.insert({3,31});
    days.insert({4,30});
    days.insert({5,31});
    days.insert({6,30});
    days.insert({7,31});
    days.insert({8,31});
    days.insert({9,30});
    days.insert({10,31});
    days.insert({11,30});
    days.insert({12,31});
    int day = 0;
    for(int i = 1; i < a; i++){
        day += days[i];
    }
    day += b;
    int what = (day-1) % 7;
    answer = yoil[what];
        
    return answer;
}