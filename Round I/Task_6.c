#include<stdbool.h>
#include <stdio.h>
#include <limits.h>
#define product(a,b) a*b

enum {thappu=false};
enum Mark {English=65,Maths=87,Science=63};

int main()
{
    int a[10];
    for(int i=0;i<10;i++)
        a[i]=99;
    a[1]=89;
    
    printf("%d\n",(*(a+1)));
    int *t=&a[0];
    printf("%d\n",*t);
    
    int b=3,c=2;
    printf("%d\n",product(c+2,b+4));
    
    unsigned int i=UINT_MAX; 
    printf("%u\n",i);
    while ( i++ != 0 ); 
    printf("%u\n",i); 
    
    char s[101]="Nithin";
    char *p=&s[0];
    printf("%p\n",p);
    
    printf("*%d",b,c);
    return 0;
}
