#include <stdio.h>
#include <string.h>

int main(){

    int n, i;
    char string[100001];
    
    while(true){
        scanf("%d", &n);
        if(n == 0)
            break;

        scanf("%s", string);

        for(i = strlen(string)-1; i >= 0; i--)
            printf("%c", string[i]);
        printf("\n");
    }

    return 0;
}