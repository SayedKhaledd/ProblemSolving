//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/X
#include<iostream>
#include<algorithm>
#include<string>
#include <cmath>

using namespace std;

int getOnesOfBinary(int n);

int convertToDecimal(int number0fOnes);

int main() {


    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        cout << convertToDecimal(getOnesOfBinary(n))<<endl;
    }


    return 0;
}

int getOnesOfBinary(int n) {
    int counter = 0;
    while (n) {
        if (n % 2 == 1) {
            counter++;
        }
        n /= 2;
    }

    return counter;
}

int convertToDecimal(int number0fOnes) {
    long long n = 0;
    for (int i = 0; i < number0fOnes; i++) {
        n += pow(2, i);
    }
    return n;
}
