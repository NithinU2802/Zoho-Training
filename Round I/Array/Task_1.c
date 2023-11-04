#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n=4,*d=(int*)malloc(sizeof(int));
    d=&n;
    printf("%d\n",*d+1);
    
    // 1D array 
    int *p=(int*)malloc(sizeof(int)*n);
    for(int i=0;i<n;i++){ 
        p[i]=i;
    }
    for(int i=0;i<n;i++)
    printf("%d ",*(p+i));
    printf("\n\n");
    
    // 2D array 
    int **arr=(int**)malloc(sizeof(int*)*n);
    for(int i=0;i<n;i++){
        arr[i]=(int*)malloc(sizeof(int)*n);
        for(int j=0;j<n;j++)
            arr[i][j]=i+j;
    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
            printf("%d ",*(*arr+i)+j);
        printf("\n");
    }
    
    for (int i = 0; i < n; i++) {
        free(arr[i]);
    }
    free(arr);
    
    return 0;
    free(p);
}
