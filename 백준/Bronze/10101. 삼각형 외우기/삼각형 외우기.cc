#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    int a,b,c;
    scanf("%d\n%d\n%d", &a,&b,&c);
    if(a == 60 && b == 60 && c == 60){
        cout << "Equilateral" << endl;
    }
    else if(a+b+c == 180 && ((a==b && b !=c)||(a==c && a != b)||(b==c && a !=b))){
        cout << "Isosceles" << endl;
    }
    else if(a+b+c == 180 && (a != b && b != c && c != a)){
        cout << "Scalene" << endl;
    }
    else{
        cout << "Error" << endl;
    }
}