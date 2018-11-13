#include <stdio.h>

int main(){
    double peso, sum = 0;
    int length = 0;

    do{
        scanf("%lf", &peso);
        if (peso != 0 && sum + peso <= 560.0){
            sum += peso;
            length++;
        }
        else
            break;
    } while (peso != 0 && length < 7 && sum <= 560.0);

    printf("%d\n%.1f\n", length, sum);

    return 0;
}