#include <stdio.h>
#include <stdlib.h>
#include <string>
#define MAX_M 500
typedef struct
{
    int u, v;
} Edge;
typedef struct
{
    int n, m;
    Edge edge[MAX_M];
} Graph;
void init_graph(Graph *pG, int n)
{
    pG->n = n;
    pG->m = 0;
}
int check(Graph G, int u, int v)
{
    for (int e = 0; e < G.n; e++)
    {
        if (G.edge[e].u == u && G.edge[e].v == v)
        {
            return 1;
        }
    }
    return 0;
}
// void add_edge(Graph *pG, int u, int v)
// {
//     if (1 > u || v > pG->n || check(*pG, u, v) == 1)
//     {
//     }
//     else
//     {
//         pG->edge[pG->m].u = u;
//         pG->edge[pG->m].v = v;
//         pG->m++;
//     }
// }
void add_edge(Graph *pG, int u, int v)
{
    if (1 > u || v > pG->n || check(*pG, u, v) == 1 || check(*pG, v, u) == 1)
    {
    }
    else
    {
        pG->edge[pG->m].u = u;
        pG->edge[pG->m].v = v;
        pG->m++;
    }
}
int main(int argc, char const *argv[])
{
    Graph G;
    init_graph(&G, 4);
    add_edge(&G, 1, 2);
    add_edge(&G, 3, 4);
    add_edge(&G, 1, 2);
    add_edge(&G, 2, 3);
    add_edge(&G, 3, 2);
    printf("Do thi co so dinh la %d, so cung la %d\n", G.n, G.m);
    for (int e = 0; e < G.m; e++)
    {
        printf("%d %d\n", G.edge[e].u, G.edge[e].v);
    }
    return 0;
}
