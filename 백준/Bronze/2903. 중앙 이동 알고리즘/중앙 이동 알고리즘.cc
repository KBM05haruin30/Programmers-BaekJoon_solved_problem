#include <stdio.h>
#include <iostream>

using namespace std;

int main() {
    int N;
    cin >> N;
    int a = 3;
    int answer = 0;
    if (N == 1) {
        answer = a * a;
    }
    for (int i = 2; i <= N; i++) {
        a = (2 * a) - 1;
        answer = a * a;
    }
    cout << answer << endl;
}