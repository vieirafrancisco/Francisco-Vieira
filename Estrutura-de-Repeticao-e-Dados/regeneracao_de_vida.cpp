#include <cstdio>
#define MAXN 10010

struct dano{
    int infligido;
    int time;
};

int main(){

    int n, y, last = 0, life = 100;
    dano damage[MAXN];

    scanf("%d", &n);

    for(int i = 0; i < n; i++)
        scanf("%d %d", &damage[i].infligido, &damage[i].time);

    scanf("%d", &y);

    for(int i = 0; i < n; i++){
        life -= damage[i].infligido;
        if(life <= 0)
            break;
        life += (damage[i].time - last)*y;
        last = damage[i].time;
    }

    if(life > 0)
        printf("Inimigo Vivo\n");
    else
        printf("Inimigo Morto\n");

    return 0;
}