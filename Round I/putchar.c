#include <stdio.h>

int f(){
    int val=1;
    val*=2;
    val*=5;
    return val;
}

int main()
{
    int a=f()*f()-3;
    putchar(65);
    putchar(a+4);
    putchar(a+8);
    putchar(a-21);
    return 0;
}

