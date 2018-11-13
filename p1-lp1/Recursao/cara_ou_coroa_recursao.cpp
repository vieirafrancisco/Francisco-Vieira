#include <cstdio>
#include <algorithm>
#define MAXN 16

int n, d;
int dp[MAXN][MAXN];

int solve(int a, int b){
    if(dp[a][b] != -1)
        return dp[a][b];

    if(a+b == n)
        if(abs(a-b) == d)
            return 1;
        else
            return 0;

    return dp[a][b] = solve(a+1,b) + solve(a,b+1);
}

int main(){

    for(int i = 0; i < MAXN; i++)
        for(int j = 0; j < MAXN; j++)
            dp[i][j] = -1;

    scanf("%d %d", &n, &d);
    printf("%d\n", solve(0,0));

    return 0;
}