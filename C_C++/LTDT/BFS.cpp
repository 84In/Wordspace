#include <stdio.h>
#include <queue>
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
    Graph g;
    init_graph(&g, 6);
    add_edge(&g, 6, 2);
    add_edge(&g, 2, 5);
    add_edge(&g, 5, 1);
    add_edge(&g, 1, 3);
    add_edge(&g, 1, 4);
    add_edge(&g, 3, 4);
    add_edge(&g, 4, 2);
    queue<int> q;
    int visit[6];
    q.push(g.edge[0].u);
    while (!q.empty())
    {
        int u = q.front();
        q.pop();
        if (visit[u] == 1)
            continue;
        printf("%d ", u);
        visit[u] = 1;
        for (int i = 0; i <= g.m; i++)
            if (visit[g.edge[i].v] != 1)
                q.push(g.edge[i].v);
    }
    return 0;
}
