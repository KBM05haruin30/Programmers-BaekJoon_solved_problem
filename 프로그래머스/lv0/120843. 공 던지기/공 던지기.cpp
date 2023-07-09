#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int k) {
    int answer = 0;
    int size = numbers.size();
    while(--k){
        answer = (answer + 2) % size;
    }
    return numbers[answer];
}