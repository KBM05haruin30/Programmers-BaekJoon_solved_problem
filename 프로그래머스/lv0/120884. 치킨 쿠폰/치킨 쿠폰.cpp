#include <string>
#include <vector>

using namespace std;

int solution(int chicken) {
    int answer = -1;
    int ticket = chicken;
    int service;
    int total = 0;
    while(1){
        service = ticket / 10;
        ticket = ticket/10 + ticket%10;
        total += service;
        if(ticket / 10 == 0){
            break;
        }
    }
    answer = total;
    return answer;
}