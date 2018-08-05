/** Progressão Aritmética **/
#include <stdio.h>
#define MAX 200001

int main()
{
    int n;
    int numbers[MAX];
    int raz[MAX];

    scanf("%d", &n);

    for (int i = 0; i < n; i++)
        scanf("%d", &numbers[i]);

    for (int i = 0; i < n - 1; i++)
    {
        raz[i] = numbers[i + 1] - numbers[i];
    }

    int r = 1;
    for (int i = 0; i < n - 2; i++)
        if (raz[i] != raz[i + 1])
        {
            i++;
            r++;
        }

    printf("%d\n", r);
}