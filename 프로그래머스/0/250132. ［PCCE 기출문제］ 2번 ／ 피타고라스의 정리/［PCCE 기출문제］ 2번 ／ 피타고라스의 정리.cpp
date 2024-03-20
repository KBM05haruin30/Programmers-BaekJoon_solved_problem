#include <iostream>

using namespace std;

int main(void) {
    int a;
    int c;
    cin >> a >> c;
    
    int b_square = abs(c*c - a*a);
    cout << b_square << endl;
    return 0;
}