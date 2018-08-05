/** Floresta **/
#include <stdio.h>

int main(){

    int n, N, x, y, c = 0;

    scanf("%d", &n);

    x = 5;
    y = 3;

    for (int i = 1; i * i <= n / 2; i++){
        N = n - x;
        if (N % y == 0)
            c++;
        x += 3;
        y += 2;
    }
    printf("%d\n", c);

    return 0;
}