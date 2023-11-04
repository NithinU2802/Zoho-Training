#include <stdio.h>

int main()
{
    int a[5]={1,2,3,4,5};
    int *ptr=(int*)(&a+1);
    //printf("%ld %ld %ld\n",&a,&a+1,&a+2);
    printf("%d %d\n",*(a+1),*(ptr-1));
    char *c[] = {"GeksQuiz", "MCQ", "TEST", "QUIZ"};
    char **cp[] = {c+3, c+2, c+1, c};
    char ***cpp = cp;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
            printf("%s ",cp[i][j]);
        printf("\n");
    }
    //printf("%s\n",*cpp[-1]);
    printf("%s ", **++cpp);
    printf("%s ", *--*++cpp+3);
    printf("%s ", *cpp[-1]);
    printf("%s ", cpp[-1][-1]+1);
    printf("\n%d",4*--a[0]);
    return 0;
}

