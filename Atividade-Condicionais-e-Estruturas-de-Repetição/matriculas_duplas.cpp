#include <stdio.h>

int main(){

    int p1[45];
    int p2[30];

    for(int i=0; i < 45; i++) scanf("%d", &p1[i]);
    for(int i=0; i < 30; i++) scanf("%d", &p2[i]);

    for(int i = 0; i < 45; i++){
        for(int j = 0; j < 30; j++){
            if(p1[i] == p2[j])
                printf("%d ", p1[i]);
        }
    }
    printf("\n");


    return 0;
}