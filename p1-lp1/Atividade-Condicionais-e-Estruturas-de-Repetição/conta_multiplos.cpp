#include <stdio.h>

int main(){

    int n1, n2, c = 0;

    scanf("%d %d", &n1, &n2);

    for(int i = n2; i<50; i+=n2)
        if(i%n1 == 0)
            c++;

    printf("%d\n", c);


    return 0;
}