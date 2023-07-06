#include <stdio.h>
#include <iostream>

using namespace std;

int main() {
	int n;
    cin >> n;
	int sum = 0;
	int i = 0;
	while (sum < n) {
		if (i == 0) {
			sum += 1;
		}
		else {
			sum += i * 6;
		}
		
		i++;
	}
	cout << i << endl;
}