#include <stdio.h>

int main(){

    double sum = 0, peso;
    int length = 0;

    while(true){
        scanf("%lf", &peso);
        if(!peso)
            break;

        sum += peso;
        length++;

        if(length == 7 || sum >= 560)
            break;
    }

    if(sum > 560){
        sum -= peso;
        length--;
    }

    printf("%d\n%.1f\n", length, sum);

    return 0;
}