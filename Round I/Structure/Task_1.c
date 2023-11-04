#include<stdio.h>

struct classroom{
  int student[7];
  //int a;
};

int main(){
    struct classroom cls={1,2,3,4,5,6};
    int *ptr;
    ptr=(int*)&cls;
    printf("%d\n",*(ptr+4));
    int a=25,b;
    int *ptr1,*ptr2;
    ptr1=&a;
    ptr2=&b;
    b=45;
    printf("%d %d",*ptr1,*ptr2);
}
