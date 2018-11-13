#include <stdio.h>
#include <string.h>

int main(){
    int n, total = 0;
    double sum = 0;

    while(scanf("%d", &n) != EOF){
        if(n > 0)
            if(n % 2 == 0){
                total++;
                sum += n;
            }
    }
    if(total)
        printf("%.2f\n", sum / total);
    else
        printf("%d\n", -1);

    return 0;
}