#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void function(char **a){
    printf("%s\n",*a);
}

void change(char **a){
    (*a)++;
}

void func(char **a){
    char *t;
    t=(a+=sizeof(int))[-1];
    printf("%s\n",t);
}

int main()
{
    char *s=(void *)malloc(100*sizeof(char));
    strcpy(s,"Nithin");
    function(&s);
    change(&s);
    printf("%s\n",s);
    char *arr[] = { "ab", "cd", "ef", "gh", "ij", "kl" };
    func(arr);
    
    int ar[][3]={1,2,3,4,5,6};
    printf("%d\n",sizeof(ar));
    int (*ptr)[3]=ar;
    printf("%d %d ",(*ptr)[1],(*ptr)[2]);
    ptr++;
    printf("%d %d ",(*ptr)[1],(*ptr)[2]);
    return 0;
}

