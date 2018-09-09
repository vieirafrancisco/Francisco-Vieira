#include <cstdio>

int binary(int a){
    if(a == 1)
        return 1;
    printf("%d\n", binary(a/2));
    return a%2;
}

int main(){

    int n;
    scanf("%d", &n);

    if(n == 0)
        printf("0\n");
    else
        printf("%d\n", binary(n));

    return 0;
}