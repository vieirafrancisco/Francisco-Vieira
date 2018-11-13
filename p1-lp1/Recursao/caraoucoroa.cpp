#include <cstdio>

long long fat(long long n){
    if(n==0 || n==1)
        return 1;
    return n*fat(n-1);
}

int main(){

    long long n, d, p, res;
    scanf("%lld %lld", &n, &d);

    if((n-d)%2)
       res = 0;
    else {
        p = (n-d)/2;
        res = fat(n)/(fat(p)*fat(n-p));
    }
    
    if(d > 0)
        res *= 2;
    
    printf("%lld\n", res);

    return 0;
}