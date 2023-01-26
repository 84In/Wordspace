#include <stdio.h>
#include <stack>
#define MAX_M 50
using namespace std;
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
        if (G.edge[e].u == u && G.edge[e].v == v)
            return 1;
    return 0;
}
void add_edge(Graph *pG, int u, int v)
{
    if (!(1 > u || v > pG->n || check(*pG, u, v) == 1))
    {
        pG->edge[pG->m].u = u;
        pG->edge[pG->m].v = v;
        pG->m++;
    }
}
int main(int argc, char const *argv[])
{
    stack<int> stack;
    Graph g;
    init_graph(&g, 6);
    add_edge(&g, 2, 3);
    add_edge(&g, 3, 6);
    add_edge(&g, 6, 2);
    add_edge(&g, 6, 4);
    add_edge(&g, 6, 5);
    add_edge(&g, 4, 1);
    add_edge(&g, 4, 2);
    add_edge(&g, 4, 5);
    add_edge(&g, 5, 4);
    stack.push(g.edge[0].u);
    bool mark[6];
    while (!stack.empty())
    {
        int u = stack.top();
        if (mark[u] == true)
            continue;
        printf("%d ", u);
        mark[u] = true;
        for (int i = 0; i < g.m; i++)
            if (mark[g.edge[i].v] != true)
                stack.push(g.edge[i].v);
    }
    return 0;
}
