#include <cstdio>

void pares(int a){
    if(a > 0)
        pares(a-1);
    if(a%2==0)
        printf("%d\n", a);
}

int main(){

    int n;
    scanf("%d", &n);

    pares(n);

    return 0;
}