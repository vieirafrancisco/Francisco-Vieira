#include <stdio.h>

int main(){

    int n1, n2, verify = 0;
    scanf("%d%d", &n1, &n2);

    int i = n1;
    while(i <= n2){
        if(verify){
            printf("%d\n", i);
            i+=4;
            continue;
        } else if(i%4==0 ^ (i%100==0 && i%400!=0)){
            printf("%d\n", i);
            verify = 1;
            i+=4;
            continue;
        }
        i++;
    }
    if(!verify)
        printf("%d\n", -1);

    return 0;
}