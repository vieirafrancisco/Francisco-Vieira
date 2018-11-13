#include <stdio.h>
#include <math.h>

int main(){

    int n, t, e, d, preco_total = 0, num_caminhoes = 0, num_dias;
    scanf("%d\n", &n);

    int max = 0, type, caminhoes;
    while(n--){
        scanf("%d %d %d", &t, &e, &d);
        if(d > max){
            max = d;
            type = e;
        }
        
        if(e == 0){
            caminhoes = ceil((float)t/10);
            num_caminhoes += caminhoes;
            preco_total += caminhoes*500;
        } else if(e == 1){
            caminhoes = ceil((float)t/5);
            num_caminhoes += caminhoes;
            preco_total += caminhoes*1200;
        }

        if(type == 0)
            num_dias = ceil((float)max/100);
        else
            num_dias = ceil((float)max/250);

    }

    printf("%d %d %d\n", num_caminhoes, preco_total, num_dias);

    return 0;
}
