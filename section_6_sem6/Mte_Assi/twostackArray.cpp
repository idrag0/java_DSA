#include <iostream>
using namespace std;

class TwoStacks {
private:
    int* arr;
    int size;
    int top1, top2;

public:
    // Constructor
    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    // Push in stack 1
    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            cout << "Stack Overflow in Stack 1\n";
        }
    }

    // Push in stack 2
    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            cout << "Stack Overflow in Stack 2\n";
        }
    }

    // Pop from stack 1
    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            cout << "Stack Underflow in Stack 1\n";
            return -1;
        }
    }

    // Pop from stack 2
    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            cout << "Stack Underflow in Stack 2\n";
            return -1;
        }
    }

    // Destructor
    ~TwoStacks() {
        delete[] arr;
    }
};

int main() {
    TwoStacks ts(10);

    ts.push1(5);
    ts.push2(15);
    ts.push1(10);
    ts.push2(20);

    cout << "Popped from Stack 1: " << ts.pop1() << endl;
    cout << "Popped from Stack 2: " << ts.pop2() << endl;

    return 0;
}