#include <cstdio>

long long binary(long long d){
    if(d == 1)
        return 1;
    printf("%lld\n", binary(d/2));
    return d%2;
}

int main(){

    long long n;
    scanf("%lld", &n);

    printf("%lld\n", binary(n));

    return 0;
}