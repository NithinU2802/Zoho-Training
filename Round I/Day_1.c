#include<stdio.h>

unsigned long int (*function())[5]{
	static unsigned long int arr[5] = {2, 3, 5, 7, 11};
	printf("%ld ", *arr);
	return &arr;
}

int main(){
    int a=5,b=5;
    int c=8;
    int *q=&a,*p=&b;
    int *r=&c;
    printf("%ld %p\n",r-q,p);
    
    unsigned long int (*ptr)[5];
    ptr=function();
    printf("%ld\n",*(*ptr+4));
    
    printf("%ld\n",sizeof(p));
    
    char *pt;
    char string[]="I am Nithin";
    pt=string;
    printf("%s\n",pt+2);
    printf("%c\n",pt[0]);
    
    char arr[5]="knot",*x,i,*y;
    x=&arr[1];
    y=x+3;
    *y=101;
    for(int i=0;i<4;i++)
        printf("%c",*x++);
}
