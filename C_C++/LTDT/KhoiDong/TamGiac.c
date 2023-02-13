#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
int main(int argc, char const *argv[])
{
    int i, j, q = 0;
    int n;
    scanf("%d", &n);
    while (n > 0)
    {
        for (int i = 1; i < n; i++)
            printf(" ");
        for (int k = 0; k <= q; k++)
            printf("*");
        n--;
        q += 2;
        printf("\n");
    }

    return 0;
}
