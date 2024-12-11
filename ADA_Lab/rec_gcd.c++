#include <iostream>
using namespace std;
int gcd1(int num1, int num2){
    if(num1 == 0 || num2==0){
        return 0;
    }
    if(num1==num2){
        return num1;
    }
    if(num1>num2){
        return gcd1(num1-num2,num2);
    }else{
        return gcd1(num1,num2-num1);
    }
    
}

int gcd2(int a,int b){
    if(b==0){
        return a;
    }

    return gcd2(b,a%b);
}

int main(){
    int a=34;
    int b=5;

    cout<<gcd1(a,b)<<endl;
    cout<<gcd2(a,b)<<endl;
}