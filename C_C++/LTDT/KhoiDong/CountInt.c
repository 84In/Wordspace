#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
int main(int argc, char const *argv[])
{
    int n, i, j, m;
    int a;
    int cnt = 0;
    scanf("%d %d", &n, &m);
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            scanf("%d", &a);
            if (a > 0)
                cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}
