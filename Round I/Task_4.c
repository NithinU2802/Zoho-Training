#include<stdio.h>

int main(){
    char ch=128;
    char *p;
    p=(char*)&ch;
    printf("%d\n",*p);
    int val=10;
    int *a,**b;
    a=&val;
    b=&a;
    printf("%d\n",**b);
    
    char *k="C";
    k="C++";
    printf("%s\n",k);
    
    k="Nithin U";
    printf("%s\n",k+3);
    
    printf("%c\n",*&*&*&*k);
    
    int *pt,d;
    d=sizeof(pt);
    printf("%d",d);
}
