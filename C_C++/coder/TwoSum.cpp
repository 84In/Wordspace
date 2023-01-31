#include <stdio.h>
#include <vector>
#include <hash_map>
#include <queue>
#include <iostream>
#include <string>
using namespace std;
vector<int> readfile()
{
    vector<int> v;
    string line;
    getline(cin, line);
    istringstream iss(line);
    FILE *fp = NULL;
    fp = fopen("Testcase.txt", "r");
    while (!EOF(fp))
    {
        if (string line; getline(cin, line))
            if (istringstream iss{line})
                copy(stdistream_iterator<int>(iss),
                     istream_iterator<int>(), back_inserter(a));
    }
    // fclose();
    return v;
}
int main()
{
    vector<int> v;
    v = readfile();
    return 0;
}
