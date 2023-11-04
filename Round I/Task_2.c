#include<stdio.h>

int function(int a,int b){
    return a+b;
}

void changes(int *a,int *b){
    int t=10;
    b=&t;
}

void change(int *a,int **b){
    int t=10;
    *b=&t;
}

void exchange(int *a,int *b){
    int t;
    t=*a;
    *a=*b;
    *b=t;
}

int main(){
    int (*ptr)(int,int);
    ptr=function;
    int a=6,b=7,*ptra=&a,*ptrb=&b;
    changes(ptra,ptrb);
    printf("Copy: %d %d\n",*ptra,*ptrb);
    change(ptra,&ptrb);
    printf("Orginal: %d %d\n",*ptra,*ptrb);
    exchange(ptra,ptrb);
    printf("Exchange: %d %d\n",*ptra,*ptrb);
    printf("%d",ptr(9,8));
}
