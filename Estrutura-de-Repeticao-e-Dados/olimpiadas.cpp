#include <cstdio>
#define MAXN 105

int resp[MAXN];

struct medalha{
    int id;
    int ouro = 0;
    int prata = 0;
    int bronze = 0;
};

void bubbleSort(medalha array[MAXN], int len){
    medalha aux;
    for(int i = 1; i < len; i++)
        for(int j = i+1; j <= len; j++)
            if(array[i].ouro < array[j].ouro){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            } else if(array[i].ouro == array[j].ouro){
                if(array[i].prata < array[j].prata){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                } else if(array[i].prata == array[j].prata){
                    if(array[i].bronze < array[j].bronze){
                        aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    } else if(array[i].bronze == array[j].bronze){
                        if(array[i].id > array[j].id){
                            aux = array[i];
                            array[i] = array[j];
                            array[j] = aux;
                        } 
                    }
                }
            }
}

int main(){

    int n, m;
    medalha medalhas[MAXN];

    scanf("%d %d", &n, &m);

    int ouro, prata, bronze;
    for(int i = 1; i <= m; i++){
        scanf("%d %d %d", &ouro, &prata, &bronze);
        medalhas[ouro].ouro++;
        medalhas[prata].prata++;
        medalhas[bronze].bronze++;
    }

    for(int i = 1; i <= n; i++) 
        medalhas[i].id = i;

    bubbleSort(medalhas, n);

    for(int i = 1; i <= n; i++){
        resp[i] = medalhas[i].id;
        printf("%d\n", resp[i]);
    }
    

    return 0;
}