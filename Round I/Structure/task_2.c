#include <stdio.h>
#include <stdlib.h>

void function(int a[]){
    a++;
    printf("\n%d ",*a);
}

int sum(int x, int *py, int **ppz)
{
  int y, z;
  **ppz += 1; 
   z  = **ppz;
  *py += 2;
   y = *py;
   x += 3;
   printf("%d %d %d\n",x,y,z);
   return x + y + z;
}

int sum1(int x,int *y){
    *y+=3;
    int d=*y;
    return x+d;
}

int main()
{
    int i;
    int *ptr=(int *)malloc(sizeof(int)*5);
    for(int i=0;i<5;i++)
        *(ptr+i)=i;
    printf("%d ",*ptr++);
    printf("%d ",(*ptr)++);
    printf("%d ",*ptr);
    printf("%d ",*++ptr);
    printf("%d ",++*ptr);
    
    int a[2]={10,20};
    function(a);
    printf("%d\n",*a);
    
    int x=4,*y,**z;
    y=&x;
    z=&y;
    printf("%d\n",sum(x,y,z));
    x=4;
    printf("%d",sum1(x,y));
    
    return 0;
}

