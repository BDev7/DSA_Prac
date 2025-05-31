#include <iostream>
using namespace std;

void div_func(int x, int y) {
    if (y == 0)
        throw y;
    else
        cout << "div = " << x / y << endl;
}

int main() {
    cout << "Inside main()" << endl;
    try {
        cout << "Inside fun()" << endl;
        div_func(10, 5);
        div_func(20, 0);
    }
    catch (int a) {
        cout << "Caught int inside main()" << endl;
    }
    cout << "End of main" << endl;
    return 0;
}
