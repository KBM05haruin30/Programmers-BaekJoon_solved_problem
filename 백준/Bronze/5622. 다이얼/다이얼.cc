#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    string s;
    cin >> s;
    int counttime = 0;
    for(int i = 0; i < s.length(); i++){
        if(s[i] >= 'A' && s[i] <= 'C'){
            counttime += 3;
        }
        else if(s[i] >= 'D' && s[i] <= 'F'){
            counttime += 4;
        }
        else if(s[i] >= 'G' && s[i] <= 'I'){
            counttime += 5;
        }
        else if(s[i] >= 'J' && s[i] <= 'L'){
            counttime += 6;
        }
        else if(s[i] >= 'M' && s[i] <= 'O'){
            counttime += 7;
        }
        else if(s[i] >= 'P' && s[i] <= 'S'){
            counttime += 8;
        }
        else if(s[i] >= 'T' && s[i] <= 'V'){
            counttime += 9;
        }
        else if(s[i] >= 'W' && s[i] <= 'Z'){
            counttime += 10;
        }
    }
    cout << counttime << endl;
}