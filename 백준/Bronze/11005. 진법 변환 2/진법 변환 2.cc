#include <stdio.h>
#include <iostream>

using namespace std;

int main()
{
    int n, b;
    cin >> n >> b;
    string s = "";
    while(n > 0){
        
        if (n % b >= 10 && n % b <= 35) {
            s += n % b + 'A' - 10;
        }
        else if (n % b >= 0 && n % b <= 9) {
            s += n % b + '0';
        }
        n = n / b;
    }
    for (int i = 0; i < s.length(); i++) {
        cout << s[s.length() - 1 - i];
    }
    cout << endl;
    
}