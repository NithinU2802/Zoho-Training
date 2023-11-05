#include<stdio.h>
#include<stdio.h>

void main()
{
    void f(void);
    f();
}
void f(void)
{
    char c;
    if((c=getchar())!='\n')
    {
        f();
        printf("%c",c);
    }
    return;
}
