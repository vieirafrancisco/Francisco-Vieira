#include <cstdio>
#include <cstring>
#define MAXN 1000100

int dp[MAXN];

int fib(int x){
    if(dp[x] != -1) return dp[x];

    if(x==0) return 0;
    if(x==1) return 1;

    dp[x]=fib(x-1)+fib(x-2);

    return dp[x];
}

int main(){
    memset(dp, -1, sizeof(dp));

    int n, f;

    scanf("%d", &n);

    f = fib(n);

    if(f < 0)
        printf("O antidoto nao e necessario\n");
    else
        printf("%d mg/L\n", fib(n));

    return 0;
}