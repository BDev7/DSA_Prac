#include <iostream>
using namespace std;

// Forward declaration of class B
class B;

// Class A declaration
class A {
private:
    int numA;
public:
    A(int n = 0) : numA(n) {}

    
    friend int findGreatest(A objA, B objB);
};

class B {
private:
    int numB;
public:
    B(int n = 0) : numB(n) {}

    friend int findGreatest(A objA, B objB);
};

int findGreatest(A objA, B objB) {
    if (objA.numA > objB.numB) {
        return objA.numA;
    } else {
        return objB.numB;
    }
}

int main() {
     A objA(10);
     B objB(20);

    int greatest = findGreatest(objA, objB);

    cout << "The greatest value is: " << greatest << endl;

    return 0;
}
