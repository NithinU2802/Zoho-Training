#include <stdio.h>

int main()
{
    int x=-1;
    while(x++==1)
        printf("Loop");
    printf("%d",x);
    printf("\n");
    
    int i=5;
    while(--i>0)
        printf("loop ");
    printf("\n");
    
    while(printf("%d",5000)<4)
        printf("loop");
    printf("\n");
    
    i=0;
    while(-1,i<4){
        printf("Loop ");
        i++;
    }
    printf("\n");
    
    int j;
    while(0,j<4){
        printf("Loop ");
        j++;
    }
    printf("%d",i);
    return 0;
}

