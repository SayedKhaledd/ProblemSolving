//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/W
#include<iostream>
#include<algorithm>
#include<string>
#include <cmath>

using namespace std;


int main() {


    int n;
    cin >> n;
    int spaces = n - 1;
    for (int i = 0; i < n; i++) {
        for (int g = 0; g < spaces; g++) {
            cout << ' ';
        }
        for (int g = 0; g <= i * 2; g++) {
            cout << '*';
        }
        cout << endl;
        spaces--;
    }

    spaces = 0;
    for (int i = n - 1; i >= 0; i--) {
        for (int g = 0; g < spaces; g++) {
            cout << ' ';
        }
        for (int g = 0; g <= i * 2; g++) {
            cout << '*';
        }
        cout << endl;
        spaces++;
    }

    return 0;
}

