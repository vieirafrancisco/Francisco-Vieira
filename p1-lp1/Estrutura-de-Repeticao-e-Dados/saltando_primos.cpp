#include <cstdio>
#define MAXN 1010

int primos[MAXN];
int camp_salto[MAXN];
int l, u;

void sieve(){
    for(int i = 2; i*i <= u; i++){
        if(primos[i])
            for(int j = i*i; j<=u; j+=i)
                primos[j] = 0;
    }
}

int main(){

    int max = 0, index = -1;
    scanf("%d %d", &l, &u);

    for(int i = 2; i <= u; i++) primos[i] = 1;

    sieve();

    int curr = 0;
    for(int i = l; i <= u; i++){
        if(primos[i]){
            if(curr == 0){
                curr = i;
                continue;
            }
            camp_salto[i-curr]++;
            curr = i;
        }
    }

    for(int i = 1; i <= u; i++){
        if(camp_salto[i] > max){
            max = camp_salto[i];
            index = i;
        }
    }

    if(!max)
        printf("%d\n", index);
    else
        printf("%d\n", index);

    return 0;
}