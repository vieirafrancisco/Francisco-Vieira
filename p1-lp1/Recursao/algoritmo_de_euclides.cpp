#include <cstdio>

// a = b*(int(a/b))+a%b
int mdc(int a, int b){
    if(a%b==0)
        return b;
    return mdc(b, a%b);
}

int main(){

    int n, a, b;
    scanf("%d", &n);

    while(n--){
        scanf("%d%d", &a, &b);
        printf("MDC(%d,%d) = %d\n", a, b, mdc(a,b));
    }

    return 0;
}